/**
 * Copyright © leaf. All Rights Reserved.
 */
package generator;


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

/**
 * @author leaf
 * @since 2013-12-271
 */
public class Mybatis3CodeGenerator {
	

	/**
	 * @author leaf
	 * @since 2013-12-27
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

		generate();
	}
	
	public static void generate() {
		try{
			String path = "/generator/mysql.xml";
        	URL config = Mybatis3CodeGenerator.class.getResource(path);
			System.out.println(config.getFile());
			String[] arg = { "-configfile", config.getFile(), "-overwrite" };
			ShellRunner.main(arg);
		}catch (Exception e){
			e.printStackTrace();
		}

    }  

}
