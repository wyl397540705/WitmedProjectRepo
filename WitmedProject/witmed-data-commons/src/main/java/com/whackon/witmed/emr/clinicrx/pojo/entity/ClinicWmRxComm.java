package com.whackon.witmed.emr.clinicrx.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;
import java.util.Date;
@Data
@TableName("emr_clinic_wm_rx_comm")
public class ClinicWmRxComm extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableField(value = "id")
	private String id;                        // 主键
	@TableField(value = "emrClinicRx")
	private String emrClinicRx;                        // 门（急）诊西医处方
	@TableField(value = "phoneCat")
	private String phoneCat;                        // 联系电话-类别
	@TableField(value = "phoneCatCode")
	private String phoneCatCode;                        // 联系电话-类别代码
	@TableField(value = "phoneNo")
	private String phoneNo;                        // 联系电话-号码
	@TableField(value = "email")
	private String email;                        // 电子邮件地址
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