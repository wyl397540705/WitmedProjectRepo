package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 专业职务视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class ProTitleVO extends BaseVO {
	private static final long serialVersionUID = -2417557677300353226L;
	private Long id;                    //主键
	private String category;            //所属类别
	private String rank;                //所属等级
	private String code;                //编码
	private String name;                //名称
}
