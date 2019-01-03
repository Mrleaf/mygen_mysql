/**
 * Copyright © leaf. All Rights Reserved.
 */
package generator;


import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellRunner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leaf
 * @since 2013-12-271
 */
public class Mybatis3CodeGenerator {


	public static void main(String[] args) throws Exception{
		List<String> path = new ArrayList<String>();
		path.add("/target/resources_xmlmapper");
		path.add("/target/src_model");
		path.add("/target/src_javamapper");
		System.out.println(System.getProperty("user.dir"));
		for(String s:path){
			File file = new File(System.getProperty("user.dir")+s);
			if (!file.exists()) {
				file.mkdirs();
			}
		}
		generate();
	}

	public static void generate() {
		try{
			//String path = "/generator/mysql.xml";
			String path = "/generator/mysql.xml";
			URL config = Mybatis3CodeGenerator.class.getResource(path);
			//防止中文路径乱码
			System.out.println(java.net.URLDecoder.decode(config.getFile(), "utf-8"));
			//"-swagger2"
			String[] arg = {"-configfile", java.net.URLDecoder.decode(config.getFile(), "utf-8"),
					"-overwrite","-swagger2"};
			MyBatisGenerator generator =  ShellRunner.main(arg);
			//防止中文路径乱码
//			String path1 = "E:/MyWork/mygen_mysql/target/TS";
//			CreateTS.CreateFile(path1,generator);
		}catch (Exception e){
			e.printStackTrace();
		}
	}



}
