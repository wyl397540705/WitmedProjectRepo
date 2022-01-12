package com.whackon.witmed.emr.clinic.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
@TableName("emr_clinic_check_report")
public class ClinicCheckReport extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private String id;                        // 主键
	@TableField(value = "emrClinic")
	private String emrClinic;                        // 所属门（急）诊病历
	@TableField(value = "checkOrg")
	private String checkOrg;                        // 检查申请单—机构（科室）
	@TableField(value = "checkNo")
	private String checkNo;                        // 检查申请单—编号
	@TableField(value = "objResult")
	private String objResult;                        // 检查报告结果-客观所见
	@TableField(value = "subResult")
	private String subResult;                        // 检查报告结果-主观提示
	@TableField(value = "checkDate")
	private Date checkDate;                        // 检查日期
	@TableField(value = "reportDate")
	private Date reportDate;                        // 检查报告日期
	@TableField(value = "remark")
	private String remark;                        // 检查报告备注
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