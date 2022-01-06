package com.whackon.witmed.base.pojo.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b>系统功能 - 系统用户登录视图信息</b>
 *
 * @author mi
 * @date 2022/1/6
 * @since
 */
public class AdminLoginVO implements Serializable {
	private static final long serialVersionUID = 7913473432925621882L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}",message = "手机号码格式错误")
	private String cellphone;               //手机号码
	@NotBlank(message = "未填写登录密码")
	@Pattern(regexp = "[A-Za-z0-9_@#]{6,}",message ="登录密码格式错误" )
	private String password;                //登录密码

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
