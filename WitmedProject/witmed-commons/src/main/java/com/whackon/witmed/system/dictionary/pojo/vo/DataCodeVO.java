package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 数据元值域代码视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = 4570131083874692406L;
	private Long id;                    //主键
	private String parent;              //上级数据
	private String code;                //编码
	private String name;                //名称
	private String status;              //系统状态：0-禁用，1-启用
	private String createdBy;           //创建人
	private Date createdTime;           //创建时间
	private String modifiedBy;          //修改人
	private Date modifiedTime;          //修改时间
}
