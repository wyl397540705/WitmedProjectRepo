package com.whackon.witmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
import java.util.Date;
@Data
@TableName("sys_role")
public class Role extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private Integer id;                        // 主键
	@TableField(value = "code")
	private String code;                        // 角色编码
	@TableField(value = "name")
	private String name;                        // 角色名称
	@TableField(value = "status")
	private String status;                        // 系统状态：0-禁用，1-启用
	@TableField(value = "createdBy")
	private String createdBy;                        // 创建人
	@TableField(value = "createdTime")
	private Date createdTime;                        // 创建时间
	@TableField(value = "modifiedBy")
	private String modifiedBy;                        // 修改人
	@TableField(value = "modifiedTime")
	private Date modifiedTime;                        // 修改时间
}