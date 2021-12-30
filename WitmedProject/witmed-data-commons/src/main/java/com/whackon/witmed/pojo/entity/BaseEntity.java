package com.whackon.witmed.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;
/**
 * <b></b>
 *
 * @author mi
 * @date 2021/12/30
 * @since
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 377806458505909427L;
	private String status;                      // 系统状态：0-禁用，1-启用
	@TableField(value = "createdBy")
	private String createdBy;                   // 创建人
	@TableField(value = "createdTime")
	private Date createdTime;                   // 创建时间
	@TableField(value = "modifiedBy")
	private String modifiedBy;                  // 修改人
	@TableField(value = "modifiedTime")
	private Date modifiedTime;                  // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
