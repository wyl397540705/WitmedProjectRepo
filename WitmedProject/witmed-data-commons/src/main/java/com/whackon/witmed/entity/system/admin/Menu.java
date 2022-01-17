package com.whackon.witmed.entity.system.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>系统菜单信息表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private Integer id;                        // 主键
	@TableField(value = "code")
	private String code;                        // 角色编码
	@TableField(value = "parent")
	private String parent;                        // 上级菜单
	@TableField(value = "text")
	private String text;                        // 菜单文本
	@TableField(value = "url")
	private String url;                        // 链接地址
	@TableField(value = "icon")
	private String icon;                        // 菜单图标样式
	@TableField(value = "sort")
	private Integer sort;                        // 排序
}