package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 行政区划视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = -225267607513977757L;
	private Long id;                    //主键
	private String parent;              //上级区划
	private String code;                //编码
	private String name;                //名称

}
