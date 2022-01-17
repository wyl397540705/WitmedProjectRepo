package com.whackon.witmed.entity.emr.clinicrx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>门（急）诊西医处方医保详情表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("emr_clinic_wm_rx_ins")
public class ClinicWmRxIns extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicRx")
	private String emrClinicRx;                        // 门（急）诊西医处方
	@TableField(value = "insCat")
	private String insCat;                        // 医疗保险-类别
	@TableField(value = "insCatCode")
	private String insCatCode;                        // 医疗保险-类别代码
}