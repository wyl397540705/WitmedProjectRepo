package com.whackon.witmed.system.admin.service;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;

/**
 * <b>系统功能 - 系统用户业务层接口</b>
 *
 * @author mi
 * @date 2022/1/6
 * @since
 */
public interface AdminService {
	/**
	 * <b>根据手机号码查询对象信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	AdminVO getAdminVOByCellphone(String cellphone)throws Exception;
}
