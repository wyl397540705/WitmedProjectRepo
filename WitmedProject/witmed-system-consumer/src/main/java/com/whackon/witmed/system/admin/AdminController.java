package com.whackon.witmed.system.admin;

import cn.hutool.crypto.digest.MD5;
import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.enums.Status;
import com.whackon.witmed.system.admin.pojo.vo.AdminLoginVO;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import com.whackon.witmed.base.util.BaseConstants;
import com.whackon.witmed.base.util.RedisUtil;
import com.whackon.witmed.base.util.TokenUtil;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统功能 - 系统用户控制层类</b>
 *
 * @author mi
 * @date 2022/1/6
 * @since
 */
@CrossOrigin
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>用户使用登录视图进行用户登录操作</b>
	 * @param adminLoginVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginAdmin(@RequestBody@Validated AdminLoginVO adminLoginVO, BindingResult result)
			throws Exception{
		//判断错误信息对象 BindingResult 中是否包含错误信息
		if(result.hasErrors()){
			return ResponseVO.error("请填写正确的手机号码和登录密码");
		}
		//用户信息校验成功，根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		//判断所得到的用户信息是否存在
		if(adminVO == null){
			//此时根据手机号码获得的用户信息不存在
			return ResponseVO.error("手机密码或登录密码错误");
		}
		//用户存在，则判断用户此时是否处于启用状态
		if(Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())){
			//此时用户的状态是禁用状态
			return ResponseVO.error("该用户禁止登录系统");
		}
		//用户处于启用状态，则对该用户登录密码进行加密，并且判断密码是否相同
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if(!adminVO.getPassword().equals(password)){
			//此时用户密码错误
			return ResponseVO.error("手机号码或登录密码错误");
		}
		//此时用户的登录密码正确，那么至此该用户登陆成功，使用工具类生成系统唯一令牌(Token)
		// 登录成功，生成系统唯一令牌 (Token)
		Map<String,String> claimMap = new HashMap<String,String>();
		claimMap.put("id",adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		// 以 Token 为 key 以用户对象为 value 存储到 Redis中去
		if (redisUtil.saveToRedis(token,adminVO,BaseConstants.EXPIRE_AUTH_SEC)){
			// 将token 和当前登录用户信息扩展到 AdminLoginVO 中
			adminLoginVO.setToken(token);
			adminLoginVO.setAdminVO(adminVO);

			return ResponseVO.success("系统登录成功", adminLoginVO);
		}
		return ResponseVO.error("系统登录失败");
	}

	/**
	 * <b>根据 Token 获得当前登录用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/info")
	public ResponseVO getLoginUserByToken(String token)throws Exception{
		AdminVO adminVO = (AdminVO) redisUtil.findFromRedis(token, AdminVO.class);
		if(adminVO == null){
			return ResponseVO.error("获取用户失败");
		}
		return ResponseVO.success("当前用户获取成功", adminVO);
	}

}
