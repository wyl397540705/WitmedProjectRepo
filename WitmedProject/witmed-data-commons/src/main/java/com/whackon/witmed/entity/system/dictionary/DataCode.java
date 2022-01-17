package com.whackon.witmed.entity.system.dictionary;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
* <b>数据元值域信息表</b>
*
* @author wyl
* @date 2022/1/12
* @version 1.0.0
* @since 1.0.0
*/
@Data
@TableName("sys_data_code")
public class DataCode extends BaseEntity {
private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private Integer id;                        // 主键
	@TableField(value = "parent")
	private String parent;                        // 上级数据元
	@TableField(value = "code")
	private String code;                        // 数据元值域
	@TableField(value = "remark")
	private String remark;                        // 数据元说明
}