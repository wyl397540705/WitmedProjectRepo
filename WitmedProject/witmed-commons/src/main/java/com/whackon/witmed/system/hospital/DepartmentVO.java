package com.whackon.witmed.system.hospital;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 医院部门视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = 4742827083186791487L;
	private Long id;                         //主键
	private String hospital;                 //所在医院
	private String parent;                   //上级部门
	private String code;                     //部门编码
	private String name;                     //部门名称

}
