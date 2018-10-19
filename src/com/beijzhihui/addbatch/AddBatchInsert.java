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
 * ˼·��
 * 1������Ŀ���ļ���
 * 2���ҵ��ļ��ǣ�.scv���ļ� ���ļ�·��
 * 3��ͨ���ļ�·�����ļ����ӱ�ĵ�2�п�ʼ������һ�����ֶΣ�
 * 4���Զ�ȡ���ַ����и��1���и����","  ��2��  �ֶ�����55����ֵ������55��ֵΪ null
 * 5
 * 
 */

public class AddBatchInsert {
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("����ʼ����������");
		String path ="C:\\Users\\Yao\\Desktop\\data_2";
		test_2(path);
		System.out.println("�������");
		

	}
	static Long countNum =0l;
	static Long countBBC =0L;
	
	public static void test_2(String path) throws Exception {
		
		String username ="root";      //user
		String password ="root";      //password
		String url ="jdbc:mysql://localhost:3306/whois?characterEncoding=utf8";   //url
		
		
		Driver driver = new com.mysql.jdbc.Driver();    //����
		DriverManager.registerDriver(driver);            //������ע��
		
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
		
		//�����ļ�
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("�ļ����ǿյ�!");
            } else {
            	Connection  conn  = null;   //��ȡ����
        		PreparedStatement ps = null;
            	
            	//�����ļ�
                for (File file2 : files) {
                	
                    if (file2.isDirectory()) {
                       // System.out.println("�ļ���:" + file2.getAbsolutePath());
                    	
                    	//����Ϊ·��
                    	                   	
                    	String lineSeparator = System.getProperty("line.separator") ;
                    	
                        test_2(file2.getAbsolutePath());
                    } else {
                    	System.out.println("�ļ�:" + file2.getAbsolutePath());
                        String p = file2.getAbsolutePath();
                        if(p.endsWith(".csv")) {
                        	
                        	File csv = new File(p);  // CSV�ļ�·��
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
                    	            //��ȡ�������ݸ�line����
                    	            while ((line = br.readLine()) != null){
                    	               everyLine = line;
                    	              // System.out.println(line);
                    	              // allString.add(new String(everyLine.getBytes("GBK"),"UTF-8"));
                    	               allString.add(everyLine);
                    	            }
                    	            	
                    	            conn  = DriverManager.getConnection(url,username,password);   //��ȡ����
                                 	ps = conn.prepareStatement(sql);
                                 	//����Ϊ�ֶ��ύ
                                 	conn.setAutoCommit(false);
                    	            // System.out.println("csv���������������"+allString.size());
                    	            for (int i = 1; i < allString.size(); i++) {
                						try {
                							String string = allString.get(i);
                							String[] split = string.split("\",\"");
                							countBBC++;
                							System.out.println(countBBC+"  "+string);
                            	            //System.out.println(countBBC);
                							//��� 
                							countNum ++;
                							
                							for (int j = 0; j < split.length; j++) {
                								// �������һ���ֶε� , �ַ�
                								if((j+1)!=split.length) {
                									ps.setString(j+1, split[j].replace("\"", ""));
                								}else {
                									String newP =split[j].replace("\"", "");
                									ps.setString(j+1, newP.replace(",", ""));
                								}
											}
                							
                							//���ַ�������55���ȵģ���ֵΪ��
                							if(split.length!=55) {
                								int a = split.length;
                								for (int q =a ; q < 55; q++) {
                									ps.setString(q+1, "");
                								}
                							}
                							
                							ps.addBatch();//����Ԥ����
                							if (countNum%100000==0) {
                								ps.executeBatch();       
                			                    conn.commit(); 
                								ps.clearBatch();    
                							}
                							
                						}catch(Exception e) {
                							//��ӡʧ�ܵ��ļ���Ϣ
                							e.printStackTrace();
                							File catchFile = new File("C:\\Users\\Yao\\Desktop\\error.txt");
                							FileOutputStream fos = new FileOutputStream(catchFile,true);
                							
                							//�ļ�λ��
                							String errorFile = "�ļ�λ�ã�"+p+" \r\n";
                							byte[] errorFileBytes = errorFile.getBytes();
                							
                							//�����ַ���
                							String errorString = "�����ַ���:"+allString.get(i)+" \r\n";
                							byte[] errorStringBytes = errorString.getBytes();
                							
                							fos.write(errorStringBytes);
                							fos.write(errorFileBytes);
                							
                							System.out.println("����ļ���"+p);
                							System.out.println("�����ַ���:"+allString.get(i));
                							System.out.println();
                							continue;
                							
                						}
                					}
                    	            
                    	        	ps.executeBatch();
                    				ps.clearBatch();
                    	            conn.commit();
                    	            
                    	            
                    	            //�ر�ps��
        							if(ps!=null) {
        								ps.close();
        							}
        							
        							//�ر�conn��
        							if(conn!=null) {
        								conn.close();
        							}
                    	            
                    	    } catch (IOException e){
                    	    	
                    	    	 //�ر�ps��
    							if(ps!=null) {
    								ps.close();
    							}
    							
    							//�ر�conn��
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
                						System.out.println("���ر�ʧ��");
                					}
                				}
                			}
                        }
                    }
                }
            }
            
            
        } else {
            System.out.println("�ļ�������!");
        }
	}
}
