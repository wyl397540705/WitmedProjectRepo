package com.whackon.witmed.patient.patient;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
@TableName("sys_patient")
public class Patient extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private String id;                        // 主键
	@TableField(value = "emrNo")
	private String emrNo;                        // 病历号
	@TableField(value = "name")
	private String name;                        // 姓名
	@TableField(value = "idType")
	private String idType;                        // 证件类型
	@TableField(value = "idNo")
	private String idNo;                        // 证件号码
	@TableField(value = "idEffDate")
	private Date idEffDate;                        // 证件生效日期
	@TableField(value = "idExpDate")
	private Date idExpDate;                        // 证件失效日期
	@TableField(value = "idOrg")
	private String idOrg;                        // 证件提供机构
	@TableField(value = "aboBlood")
	private String aboBlood;                        // ABO血型
	@TableField(value = "rhBlood")
	private String rhBlood;                        // RH血型
	@TableField(value = "gender")
	private String gender;                        // 性别
	@TableField(value = "nationality")
	private String nationality;                        // 国籍
	@TableField(value = "ethnic")
	private String ethnic;                        // 民族
	@TableField(value = "marital")
	private String marital;                        // 婚姻状况
	@TableField(value = "education")
	private String education;                        // 文化程度
	@TableField(value = "birthday")
	private Date birthday;                        // 出生日期
	@TableField(value = "birthplace")
	private String birthplace;                        // 出生地
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