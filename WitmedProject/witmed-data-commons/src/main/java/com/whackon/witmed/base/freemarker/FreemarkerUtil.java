package com.whackon.witmed.base.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * <b></b>
 *
 * @author mi
 * @date 2022/1/5
 * @since
 */
public class FreemarkerUtil {

	public static boolean createEntity(Entity entity){
		//创建 Freemarker Configuaration  对象
		Configuration configuration =new Configuration(Configuration.VERSION_2_3_31);
		try {
			// 获得位于 resources 路径下的 freemarker 文件
			String freemarkerPath = ResourceUtils.getURL("classpath:").getPath() + "freemarker";
			// 设置所使用的 Freemarker 的模板所在的路径位置
			configuration.setDirectoryForTemplateLoading(new File(freemarkerPath));
			// 生成目标文件的编码格式
			configuration.setDefaultEncoding("UTF-8");
			// 设定所需要生成目标文件的 freemarker 目标是哪个
			Template template = configuration.getTemplate( "entity.ftl");
			// 设定目标文件生成路径
			// 获得位于 resources 路径下的 freemarker 文件
			String targetPath = ResourceUtils.getURL("classpath:").getPath();
			// 将获得的路径切换到 src 下
			targetPath = targetPath.substring(0, targetPath.indexOf("target/classes/"));
			// 形成目标文件所在文件夹路径
			targetPath = targetPath + "src/main/java/";
			// 将对应的包结构变为文件夹结构，连接到目标文件夹路径下
			targetPath = targetPath + entity.getPackageName().replace(".", "/") + "/";
			// 根据路径和生成文件创建对应的 File 对象
			File targetFile = new File(targetPath + entity.getClassName() + ".java");
			// 根据 File 创建 BufferedWriter 对象
			BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
			// 使用 Freemarker 生成对应的文件
			template.process(entity, bw);
			bw.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
