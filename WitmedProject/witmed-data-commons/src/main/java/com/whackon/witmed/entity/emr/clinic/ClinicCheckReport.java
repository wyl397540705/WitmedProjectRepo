package com.whackon.witmed.entity.emr.clinic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>门（急）诊病历检查报告详情表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("emr_clinic_check_report")
public class ClinicCheckReport extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
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
}