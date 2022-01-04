package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 系统用户视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 811957010974699686L;
	private Long id;                    //主键
	private String no;                  //工号
	private String name;                //姓名
	private String cellphone;           //手机号码
	private String password;            //登录密码
	private String role;                //角色
	private String identity;            //身份
	private String department;          //所在部门
	private String techPos;             //服务者专业技术职务
	private String education;           //学历
	private String techPosRank;         //服务者专业技术职务等级
	private String status;              //系统状态:0-禁用，1-启用
	private String createdBy;           //创建人
	private Date createdTime;           //创建时间
	private String modifiedBy;          //修改人
	private Date modifiedTime;          //修改时间
}
