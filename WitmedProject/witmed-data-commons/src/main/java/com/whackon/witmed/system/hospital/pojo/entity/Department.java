package com.whackon.witmed.system.hospital.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 医院部门实体信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class Department extends BaseEntity {
	private static final long serialVersionUID = -5793475151487271519L;
	private Long id;                         //主键
	private String hospital;                 //所在医院
	private String parent;                   //上级部门
	private String code;                     //部门编码
	private String name;                     //部门名称
	private String status;                   //系统状态：0-禁用，1-启用
	private String createdBy;                //创建人
	private Date createdTime;              //创建时间
	private String modifiedBy;               //修改人
	private Date  modifiedTime;             //修改时间
}
