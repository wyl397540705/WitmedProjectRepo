package ${packageName};

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

**
* <b>系统功能 - 系统用户实体信息</b>
*
* @author mi
* @date 2022/1/5
* @since
*/
@Data
public class ${className} extends BaseEntity {
			<#list propertyList as property>
			private ${property.type} ${property.name};                        // ${property.comment}
            </#list>
}