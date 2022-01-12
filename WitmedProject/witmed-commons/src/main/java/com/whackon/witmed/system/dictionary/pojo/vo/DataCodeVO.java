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

}
