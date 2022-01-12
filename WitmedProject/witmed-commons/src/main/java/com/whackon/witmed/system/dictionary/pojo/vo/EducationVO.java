package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 学历视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class EducationVO extends BaseVO {
	private static final long serialVersionUID = 1555780183776973953L;
	private Long id;                  //主键
	private String code;              //编码
	private String name;              //名称

}
