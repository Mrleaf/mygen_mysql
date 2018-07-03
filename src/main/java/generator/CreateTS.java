package generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;

import java.io.*;

/**
 * 作者:叶舟
 * 时间:2018/6/29 17:41
 *
 * 前端实体生成
 */
public class CreateTS {

    //生成文件路径
    private static String path = "E:\\file\\";

    //文件路径+名称
    private static String filenameTemp;

    public static void CreateFile(String url,MyBatisGenerator generator){
        deleteDirectory(path);
        StringBuffer sb = null;
        for(IntrospectedTable table:generator.getConfiguration().getContexts().get(0).getIntrospectedTables()){
            sb = new StringBuffer();
            sb.append("export interface ").append(table.getFullyQualifiedTable().getDomainObjectName()).append(" {\r\n");
            for(IntrospectedColumn column:table.getPrimaryKeyColumns()){
                sb.append(getColumns(column));
            }
            for(IntrospectedColumn column:table.getBaseColumns()){
                sb.append(getColumns(column));
            }
            for(IntrospectedColumn column:table.getBLOBColumns()){
                sb.append(getColumns(column));
            }
            sb.append("}");
            createFile(table.getFullyQualifiedTable().getDomainObjectName(),sb.toString());
        }

    }

    private static String getColumns(IntrospectedColumn column){
        StringBuffer sb = new StringBuffer();
        if(column.getRemarks()!=null&&column.getRemarks()!=""){
            sb.append(" /**\r\n").append("  * ").append(column.getRemarks()).append("\r\n").append("  */\r\n");
        }
        sb.append(" ").append(column.getJavaProperty()).append(": ");
        if(column.getJdbcTypeName().matches("DOUBLE|REAL|DECIMAL|INTEGER")){
            //数字
            sb.append("number").append(";\r\n");
        }else if(column.getJdbcTypeName().matches("DATE|TIME|TIMESTAMP")){
            //时间
            sb.append("number").append(";\r\n");
        }else{
            sb.append("string").append(";\r\n");
        }

        return sb.toString();
    }



    /**
     * 创建文件
     * @param fileName  文件名称
     * @param filecontent   文件内容
     * @return  是否创建成功，成功则返回true
     */
    public static boolean createFile(String fileName,String filecontent){
        Boolean bool = false;
        filenameTemp = path+fileName+".ts";//文件路径+名称+文件类型
        File file = new File(filenameTemp);
        try {
            if(!file.exists()){
                file.getParentFile().mkdir();
                file.createNewFile();
                bool = true;
                //创建文件成功后，写入内容到文件里
                writeFileContent(filenameTemp, filecontent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bool;
    }



    /**
     * 向文件中写入内容
     * @param filepath 文件路径与名称
     * @param newstr  写入的内容
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException {
        Boolean bool = false;
        String filein = newstr+"\r\n";//新写入的行，换行
        String temp  = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();

            //文件原有内容
            for(int i=0;(temp =br.readLine())!=null;i++){
                buffer.append(temp);
                // 行与行之间的分隔符 相当于“\n”
                buffer = buffer.append(System.getProperty("line.separator"));
            }
            buffer.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }


    /**
     * 删除目录及目录下的文件
     * @param dir 删除的目录的文件路径
     * @return 成功返回true 失败返回false
     */
    public static boolean deleteDirectory(String dir) {
        // 如果dir不以文件分隔符结尾，自动添加文件分隔符
        if (!dir.endsWith(File.separator)) {
            dir = dir + File.separator;
        }
        File dirFile = new File(dir);
        // 如果dir对应的文件不存在，或者不是一个目录，则退出
        if ((!dirFile.exists()) || (!dirFile.isDirectory())) {
            return false;
        }
        boolean flag = true;
        // 删除文件夹中的所有文件包括子目录
        File[] files = dirFile.listFiles();
        if (files == null) {
            return false;
        }
        for (File file : files) {
            // 删除子文件
            if (file.isFile()) {
                flag = deleteFile(file.getAbsolutePath());
                if (!flag) {
                    break;
                }

            }
            // 删除子目录
            else if (file.isDirectory()) {
                flag = deleteDirectory(file.getAbsolutePath());
                if (!flag) {
                    break;
                }

            }
        }
        if (!flag) {
            return false;
        }
        // 删除当前目录
        return dirFile.delete();
    }


    /**
     * 删除单个文件
     *
     * @param filePath 要删除的文件的文件名
     * @return 成功返回 true 失败返回false
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
        if (file.exists() && file.isFile()) {
            return file.delete();
        } else {
            return false;
        }
    }
}
