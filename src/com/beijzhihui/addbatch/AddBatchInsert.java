package com.beijzhihui.addbatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 思路：
 * 1、遍历目标文件夹
 * 2、找到文件是：.scv的文件 的文件路径
 * 3、通过文件路径（文件）从表的第2行开始读（第一行是字段）
 * 4、对读取的字符串切割。（1）切割规则：","  （2）  字段数量55，则赋值，不满55则赋值为 null
 * 5
 * 
 */

public class AddBatchInsert {
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("程序开始。。。。。");
		String path ="C:\\Users\\Yao\\Desktop\\data_2";
		test_2(path);
		System.out.println("程序结束");
		

	}
	static Long countNum =0l;
	static Long countBBC =0L;
	
	public static void test_2(String path) throws Exception {
		
		String username ="root";      //user
		String password ="root";      //password
		String url ="jdbc:mysql://localhost:3306/whois?characterEncoding=utf8";   //url
		
		
		Driver driver = new com.mysql.jdbc.Driver();    //驱动
		DriverManager.registerDriver(driver);            //驱动的注册
		
		String sql ="    INSERT " + 
				"    INTO " + 
				"        whois_domain " + 
				"        (domain, registrar, reg_email, registrar_whois_server, name_server, reg_date, updated_date, expir_date, domain_status, registrar_abuse_contact_email, reg_name, registrant_organization, registrant_street1, registrant_street2, registrant_street3, registrant_street4, registrant_city, registrant_state_province, registrant_postal_code, reg_country, reg_fax, registrant_fax_ext, registrar_abuse_contact_phone, registrant_phone_ext, adm_email, adm_name, admin_organization, administrativeContact_street1, administrativeContact_street2, administrativeContact_street3, administrativeContact_street4, admin_city, admin_state_province, admin_postal_code, adm_country, adm_fax, admin_fax_ext, adm_phone, admin_phone_ext, tech_email, tech_name, tech_organization, technicalContact_street1, technicalContact_street2, technicalContact_street3, technicalContact_street4, tech_city, tech_state_province, tech_postal_code, tech_country, tech_fax, tech_fax_ext, tech_phone, tech_phone_ext, registrar_IANA_id) " + 
				"    VALUES  " + 
				"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "	?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		
		
		
		
		File file = new File(path);
		
		//遍历文件
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
            } else {
            	Connection  conn  = null;   //获取连接
        		PreparedStatement ps = null;
            	
            	//遍历文件
                for (File file2 : files) {
                	
                    if (file2.isDirectory()) {
                       // System.out.println("文件夹:" + file2.getAbsolutePath());
                    	
                    	//设置为路径
                    	                   	
                    	String lineSeparator = System.getProperty("line.separator") ;
                    	
                        test_2(file2.getAbsolutePath());
                    } else {
                    	System.out.println("文件:" + file2.getAbsolutePath());
                        String p = file2.getAbsolutePath();
                        if(p.endsWith(".csv")) {
                        	
                        	File csv = new File(p);  // CSV文件路径
                    	    BufferedReader br = null;
                    	    try{
                    	    	InputStreamReader read = new InputStreamReader(new FileInputStream(csv),"utf-8");
                    	    	br = new BufferedReader(read);
                    	    	
                    	    	//BufferedReader reader = new BufferedReader(read);
                    	        //br = new BufferedReader(new FileReader(csv));
                    	    	
                    	    } catch (FileNotFoundException e){
                    	        e.printStackTrace();
                    	    }
                    	    String line = "";
                    	    List<String> allString = null;
                    	    String everyLine = "";
                    	    try {
                    	            allString = new ArrayList<>();
                    	            //读取到的内容给line变量
                    	            while ((line = br.readLine()) != null){
                    	               everyLine = line;
                    	              // System.out.println(line);
                    	              // allString.add(new String(everyLine.getBytes("GBK"),"UTF-8"));
                    	               allString.add(everyLine);
                    	            }
                    	            	
                    	            conn  = DriverManager.getConnection(url,username,password);   //获取连接
                                 	ps = conn.prepareStatement(sql);
                                 	//设置为手动提交
                                 	conn.setAutoCommit(false);
                    	            // System.out.println("csv表格中所有行数："+allString.size());
                    	            for (int i = 1; i < allString.size(); i++) {
                						try {
                							String string = allString.get(i);
                							String[] split = string.split("\",\"");
                							countBBC++;
                							System.out.println(countBBC+"  "+string);
                            	            //System.out.println(countBBC);
                							//标记 
                							countNum ++;
                							
                							for (int j = 0; j < split.length; j++) {
                								// 消除最后一个字段的 , 字符
                								if((j+1)!=split.length) {
                									ps.setString(j+1, split[j].replace("\"", ""));
                								}else {
                									String newP =split[j].replace("\"", "");
                									ps.setString(j+1, newP.replace(",", ""));
                								}
											}
                							
                							//对字符串不满55长度的，赋值为空
                							if(split.length!=55) {
                								int a = split.length;
                								for (int q =a ; q < 55; q++) {
                									ps.setString(q+1, "");
                								}
                							}
                							
                							ps.addBatch();//进行预编译
                							if (countNum%100000==0) {
                								ps.executeBatch();       
                			                    conn.commit(); 
                								ps.clearBatch();    
                							}
                							
                						}catch(Exception e) {
                							//打印失败的文件信息
                							e.printStackTrace();
                							File catchFile = new File("C:\\Users\\Yao\\Desktop\\error.txt");
                							FileOutputStream fos = new FileOutputStream(catchFile,true);
                							
                							//文件位置
                							String errorFile = "文件位置："+p+" \r\n";
                							byte[] errorFileBytes = errorFile.getBytes();
                							
                							//错误字符串
                							String errorString = "错误字符串:"+allString.get(i)+" \r\n";
                							byte[] errorStringBytes = errorString.getBytes();
                							
                							fos.write(errorStringBytes);
                							fos.write(errorFileBytes);
                							
                							System.out.println("这个文件："+p);
                							System.out.println("错误字符串:"+allString.get(i));
                							System.out.println();
                							continue;
                							
                						}
                					}
                    	            
                    	        	ps.executeBatch();
                    				ps.clearBatch();
                    	            conn.commit();
                    	            
                    	            
                    	            //关闭ps流
        							if(ps!=null) {
        								ps.close();
        							}
        							
        							//关闭conn流
        							if(conn!=null) {
        								conn.close();
        							}
                    	            
                    	    } catch (IOException e){
                    	    	
                    	    	 //关闭ps流
    							if(ps!=null) {
    								ps.close();
    							}
    							
    							//关闭conn流
    							if(conn!=null) {
    								conn.close();
    							}
                    	    	
                    	        e.printStackTrace();
                    	        continue;
                    	    }finally {
                    	    	
                    	    	
                				if(br!=null) {
                					try {
                						br.close();
                					} catch (IOException e) {
                						System.out.println("流关闭失败");
                					}
                				}
                			}
                        }
                    }
                }
            }
            
            
        } else {
            System.out.println("文件不存在!");
        }
	}
}
