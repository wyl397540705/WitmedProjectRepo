import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("${tableName}")
public class ${entityName} extends BaseEntity {
	private static final long serialVersionUID = 1L;
<#list propertyList as property>
	@TableField(value = "${property.name}")
	private ${property.type} ${property.name};                        // ${property.comment}
</#list>
}