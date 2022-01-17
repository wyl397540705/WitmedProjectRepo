package com.whackon.witmed.entity.system.hospital;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>医院部门信息表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("sys_department")
public class Department extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private Integer id;                        // 主键
	@TableField(value = "hospital")
	private String hospital;                        // 所在医院
	@TableField(value = "parent")
	private String parent;                        // 上级部门
	@TableField(value = "code")
	private String code;                        // 部门编码
	@TableField(value = "name")
	private String name;                        // 部门名称
}