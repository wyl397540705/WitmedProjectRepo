package com.whackon.witmed.system.hospital;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 医院视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class HospitalVO extends BaseVO {
	private static final long serialVersionUID = 3822236000819700118L;
	private Long id;                  //主键
	private String name;              //机构名称
	private String authority;         //上级主管机构名称
	private String orgCode;           //组织机构代码
	private String charge;            //机构负责人
	private String addressCatCode;    //标识地址类别代码
	private String provence;          //所在省
	private String city;              //所在城市
	private String county;              //所在区县
	private String town;              //地址-乡（镇、街道办事处）
	private String village;              //地址-村（街、路、弄等）
	private String doorNo;              //地址-门牌号码
	private String zipCode;              //邮政编码
	private String divisionCode;      //行政区划代码
	private String telephoneCat;      //联系电话-类别信息
	private String telephone;         //联系电话-号码
	private String email;              //电子邮件地址
	private String status;            //系统状态：0-禁用，1-启用
	private String createBy;          //创建人
	private Date createTime;        //创建时间
	private String modifiedBy;        //修改人
	private Date modifiedTime;      //修改时间
}
