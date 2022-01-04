package com.whackon.witmed.system.professional.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 专业职务等级实体信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class ProRank extends BaseEntity {
	private static final long serialVersionUID = -8698126882863934465L;
	private Long id;                  //主键
	private String code;              //编码
	private String name;              //名称
	private String status;            //系统状态：0-禁用，1-启用
	private String createdBy;         //创建人
	private Date createdTime;         //创建时间
	private String modifiedBy;        //修改人
	private Date modifiedTime;        //修改时间
}
