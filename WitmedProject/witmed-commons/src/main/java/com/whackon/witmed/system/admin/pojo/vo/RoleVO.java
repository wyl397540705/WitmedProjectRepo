package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 系统菜单功能视图信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = -8891884516513232086L;
	private Long id;                    //主键
	private String code;                //角色编码
	private String name;                //角色名称
	private String status;              //系统状态： 0-禁用，1-启用
	private String createBy;            //创建人
	private Date createTime;            //创建时间
	private String modifiedBy;          //修改人
	private Date modifiedTime;          //修改时间
}
