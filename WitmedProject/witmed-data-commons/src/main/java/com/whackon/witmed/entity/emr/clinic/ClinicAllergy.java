package com.whackon.witmed.entity.emr.clinic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>门（急）诊病历过敏史详情表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("emr_clinic_allergy")
public class ClinicAllergy extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinic")
	private String emrClinic;                        // 所属门（急）诊病历
	@TableField(value = "history")
	private String history;                        // 过敏史
	@TableField(value = "allergen")
	private String allergen;                        // 过敏原
	@TableField(value = "allSx")
	private String allSx;                        // 过敏症状
	@TableField(value = "allSxCode")
	private String allSxCode;                        // 过敏症状代码
	@TableField(value = "allergenCode")
	private String allergenCode;                        // 过敏原代码
	@TableField(value = "medicant")
	private String medicant;                        // 过敏药物名称
	@TableField(value = "statusCode")
	private String statusCode;                        // 过敏病情状态代码
	@TableField(value = "markCode")
	private String markCode;                        // 过敏史标识代码
}