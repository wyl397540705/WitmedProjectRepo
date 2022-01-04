package com.whackon.witmed.system.admin.pojo.entity;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * <b>系统功能 - 系统菜单功能实体信息</b>
 *
 * @author mi
 * @date 2022/1/4
 * @since
 */
@Data
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 6494472229034048736L;
	private Long id;                    //主键
	private String code;                //角色编码
	private String parent;              //上级菜单
	private String text;                //菜单文本
	private String url;                 //链接地址
	private String icon;                //菜单图表样式
	private Integer sort;               //排序
	private String status;              //系统状态： 0-禁用，1-启用
	private String createBy;            //创建人
	private Date createdTime;           //创建时间
	private String modifiedBy;          //修改人
	private Date modifiedTime;          //修改时间
}
