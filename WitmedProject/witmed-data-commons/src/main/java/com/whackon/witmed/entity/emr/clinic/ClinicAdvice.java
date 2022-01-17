package com.whackon.witmed.entity.emr.clinic;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
* <b>门（急）诊病历医嘱详情表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("emr_clinic_advice")
public class ClinicAdvice extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinic")
	private String emrClinic;                        // 所属门（急）诊病历
	@TableField(value = "startDate")
	private Date startDate;                        // 医嘱开嘱日期时间
	@TableField(value = "stopDate")
	private Date stopDate;                        // 长期医嘱停嘱日期时间
	@TableField(value = "execDate")
	private Date execDate;                        // 医嘱执行日期时间
	@TableField(value = "execDateCatCode")
	private String execDateCatCode;                        // 医嘱执行时间类别代码
	@TableField(value = "execCnlDate")
	private Date execCnlDate;                        // 医嘱取消日期时间
	@TableField(value = "adviceCat")
	private String adviceCat;                        // 医嘱类别
	@TableField(value = "adviceDetail")
	private String adviceDetail;                        // 医嘱内容
}