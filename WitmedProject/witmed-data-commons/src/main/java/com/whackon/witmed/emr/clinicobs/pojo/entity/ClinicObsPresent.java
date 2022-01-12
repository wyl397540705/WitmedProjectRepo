package com.whackon.witmed.emr.clinicobs.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
import java.util.Date;

@Data
@TableName("emr_clinic_obs_present")
public class ClinicObsPresent extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private String id;                        // 主键
	@TableField(value = "emrClinicObs")
	private String emrClinicObs;                        // 所属急诊留观病历
	@TableField(value = "onsetDate")
	private Date onsetDate;                        // 起病时间
	@TableField(value = "onsetDesc")
	private String onsetDesc;                        // 起病情况描述
	@TableField(value = "sxOnsetReason")
	private String sxOnsetReason;                        // 症状开始原因/诱因
	@TableField(value = "sxCh")
	private String sxCh;                        // 症状特点
	@TableField(value = "sxAcc")
	private String sxAcc;                        // 伴随症状
	@TableField(value = "pastTrt")
	private String pastTrt;                        // 本疾病既往诊疗经过
	@TableField(value = "baseTrt")
	private String baseTrt;                        // 基础疾病诊疗情况
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