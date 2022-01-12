package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 专业职务类别视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class ProCategoryVO extends BaseVO {
	private static final long serialVersionUID = -4794427901024177119L;
	private Long id;                  //主键
	private String code;              //编码
	private String name;              //名称

}
