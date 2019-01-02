package org.mybatis.generator.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

import java.util.LinkedList;
import java.util.List;

/**
 * 生成可读的数据库注释到实体注释(swagger )。
 * 
 * @author leaf
 * @since 2019-1-1
 */
public class SwaggerCommentPlugin extends PluginAdapter {
	
	
	protected boolean annotated=false;
	
	/**
	 * 添加javadoc注释
	 * 
	 * @param comment
	 * @return String
	 * @author leaf
	 * @since 2019-1-1
	 */
	public String formatApiModelProperty(String comment){
		StringBuffer javadocline=new StringBuffer();
		if(comment==null){
			return javadocline.toString();
		}
		javadocline.append("@ApiModelProperty(value=\"").append(comment).append("\")");
		return javadocline.toString();
	}

	/**
	 * 添加javadoc注释
	 *
	 * @param comment
	 * @param tflag
	 * @return List<String> lines
	 * @author leaf
	 * @since 2019-1-1
	 */
	public List<String> formatJavaDocLines(String comment, boolean tflag){
		List<String> javadoclines=new LinkedList<String>();
		if(comment==null){
			return javadoclines;
		}
		String ch="";
		if(tflag){
			ch="        ";
		}
		String[] lines = comment.split("\n");
		for(String line : lines){
			line.replaceAll("\r", "");
			line.replaceAll("\n", "");
			javadoclines.add(" * "+ch+line);
		}

		return javadoclines;
	}
	
	/**
	 * 添加javadoc注释	类
	 * 
	 * @author leaf
	 * @since 2019-1-1
	 */
	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass clazz, IntrospectedTable table){
		String tablename = table.getAliasedFullyQualifiedTableNameAtRuntime();
		String objectName = table.getFullyQualifiedTable().getDomainObjectName();
		String remarks = table.getFullyQualifiedTable().getRemarks();
		table.getFullyQualifiedTableNameAtRuntime();
		List<String> javadoclines=formatJavaDocLines(tablename+"\n"+remarks,false);

		clazz.addJavaDocLine("/**");
		//field.addJavaDocLine(" * "+comment);
		for(String line : javadoclines){
			clazz.addJavaDocLine(line);
		}
		clazz.addJavaDocLine(" */");
		clazz.addJavaDocLine("@ApiModel(value=\""+objectName+"\",description=\""+remarks+"\")");
		if(annotated){
			FullyQualifiedJavaType dbInfoAnnotationJavaType=new FullyQualifiedJavaType("org.mybatis.annotation.Table");
			clazz.addImportedType(dbInfoAnnotationJavaType);
			clazz.addAnnotation("@Table(name=\""+tablename+"\")");
		}
		
		
		return super.modelBaseRecordClassGenerated(clazz, table);
	}
	
	/**
	 * 添加javadoc注释	字段
	 * 
	 * @author leaf
	 * @since 2019-1-1
	 */
	@Override
	public boolean modelFieldGenerated(Field field, TopLevelClass topClass,
			IntrospectedColumn colum, IntrospectedTable table, ModelClassType modelClassType) {
		
		String comment = colum.getRemarks();
		String fieldName = field.getName();
		
		if(comment==null || comment.length()==0){
			comment = fieldName;
		}
		List<String> javadoclines=formatJavaDocLines(comment,false);
		field.addJavaDocLine(formatApiModelProperty(comment));
		
		if(annotated){
			FullyQualifiedJavaType dbInfoAnnotationJavaType=new FullyQualifiedJavaType("org.mybatis.annotation.Field");
			topClass.addImportedType(dbInfoAnnotationJavaType);
			
			String clazz = colum.getFullyQualifiedJavaType().getFullyQualifiedName()+".class";
			String columnName = colum.getActualColumnName();
			String jdbcType = colum.getJdbcTypeName();
			int length = colum.getLength();
			int scale = colum.getScale();
			field.addAnnotation("@Field(columnName=\""+columnName+"\", jdbcType=\""+jdbcType+"\", javaType="+clazz+", length="+length+", scale="+scale+")");
		}
		
		
		Field nameField=new Field();
		nameField.setVisibility(JavaVisibility.PUBLIC);
		nameField.setStatic(true);
		nameField.setFinal(true);
		nameField.setType(FullyQualifiedJavaType.getStringInstance());
		nameField.setName(fieldName.toUpperCase());
		nameField.setInitializationString("\""+fieldName+"\"");
		nameField.addJavaDocLine("/**");
		//nameField.addJavaDocLine(" * "+comment);
		for(String line : javadoclines){
			nameField.addJavaDocLine(line);
		}
		nameField.addJavaDocLine(" */");
		topClass.addField(nameField);
		
		return super.modelFieldGenerated(field, topClass, colum, table, modelClassType);
	}
	
	/**
	 * 添加javadoc注释	get
	 * 
	 * @author leaf
	 * @since 2019-1-1
	 */
	@Override
	public boolean modelGetterMethodGenerated(Method method, TopLevelClass topClass,
			IntrospectedColumn colum, IntrospectedTable table, ModelClassType modelClassType) {
		String fieldName = method.getName().replaceFirst("get", "");
		char ch = fieldName.charAt(0);  
        fieldName = Character.toLowerCase(ch) + fieldName.substring(1);
		String comment = colum.getRemarks();
		
		
		if(comment==null || comment.length()==0){
			comment = fieldName;
		}
		List<String> javadoclines=formatJavaDocLines(comment,true);
		
		method.addJavaDocLine("/**");
		method.addJavaDocLine(" * @return "+fieldName);
		for(String line : javadoclines){
			method.addJavaDocLine(line);
		}
		method.addJavaDocLine(" */");
		return super.modelSetterMethodGenerated(method, topClass, colum, table, modelClassType);
	}
	
	/**
	 * 添加javadoc注释	set
	 * 
	 * @author leaf
	 * @since 2019-1-1
	 */
	@Override
	public boolean modelSetterMethodGenerated(Method method, TopLevelClass topClass,
			IntrospectedColumn colum, IntrospectedTable table, ModelClassType modelClassType) {
		String fieldName = method.getName().replaceFirst("set", "");
		char ch = fieldName.charAt(0);  
        fieldName = Character.toLowerCase(ch) + fieldName.substring(1);
		String comment = colum.getRemarks();
		
		
		if(comment==null || comment.length()==0){
			comment = fieldName;
		}
		
		List<String> javadoclines=formatJavaDocLines(comment,true);
		
		method.addJavaDocLine("/**");
		method.addJavaDocLine(" * @param "+fieldName);
		for(String line : javadoclines){
			method.addJavaDocLine(line);
		}
		method.addJavaDocLine(" */");
		return super.modelSetterMethodGenerated(method, topClass, colum, table, modelClassType);
		
	}
	
    /** 
     * This plugin is always valid - no properties are required 
     */  
    public boolean validate(List<String> warnings) {  
        return true;  
    }  
    
}  