package com.whackon.witmed.system.dictionary.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class Identity extends BaseEntity {
	private static final long serialVersionUID = 7229802796791467997L;
	private Long id;                  //主键
	private String code;              //编码
	private String name;              //名称
	private String status;            //系统状态：0-禁用，1-启用
	private String createdBy;         //创建人
	private Date createdTime;         //创建时间
	private String modifiedBy;        //修改人
	private Date modifiedTime;        //修改时间
}
