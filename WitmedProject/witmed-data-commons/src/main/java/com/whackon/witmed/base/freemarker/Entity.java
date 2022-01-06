package com.whackon.witmed.base.freemarker;


import java.io.Serializable;
import java.util.List;

/**
 * <b></b>
 *
 * @author mi
 * @date 2022/1/5
 * @since
 */
public class Entity implements Serializable {
	private static final long serialVersionUID = 7666766629557858823L;
	private String packageName;         //实体类对应包名
	private String className;           //实体类对应类名
	private List<Property> propertyList;    //实体类对应属性列表

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}
}
