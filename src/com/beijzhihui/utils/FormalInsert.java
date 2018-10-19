package com.beijzhihui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
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
 * Ч�ʣ�1����950��
 */

public class FormalInsert {
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("����ʼ����������");
		long currentTimeMillis1= System.currentTimeMillis();
		String path ="C:\\Users\\Yao\\Desktop\\�½��ļ��� (2)";
		test_2(path);
		System.out.println("�������");
		System.out.println("��鿴 ==>  error.txt.ͨ���ֶ�������");
		long currentTimeMillis2= System.currentTimeMillis();
		
		System.out.println("�ܼƺ�ʱ��"+(currentTimeMillis2-currentTimeMillis1)/1000/60/60);
		
	}
	
	public static void test_2(String path) throws Exception {
		
		int countNum =0;
		
		String username ="root";      //user
		String password ="root";      //password
		String url ="jdbc:mysql://localhost:3306/domain_db";   //url
		Driver driver = new com.mysql.jdbc.Driver();    //����
		DriverManager.registerDriver(driver);            //������ע��
		Connection  conn = null;
		String sql ="    INSERT " + 
				"    INTO " + 
				"        whoisdemo " + 
				"        (domain, registrar, reg_email, registrar_whois_server, name_server, reg_date, updated_date, expir_date, domain_status, registrar_abuse_contact_email, reg_name, registrant_organization, registrant_street1, registrant_street2, registrant_street3, registrant_street4, registrant_city, registrant_state_province, registrant_postal_code, reg_country, reg_fax, registrant_fax_ext, registrar_abuse_contact_phone, registrant_phone_ext, adm_email, adm_name, admin_organization, administrativeContact_street1, administrativeContact_street2, administrativeContact_street3, administrativeContact_street4, admin_city, admin_state_province, admin_postal_code, adm_country, adm_fax, admin_fax_ext, adm_phone, admin_phone_ext, tech_email, tech_name, tech_organization, technicalContact_street1, technicalContact_street2, technicalContact_street3, technicalContact_street4, tech_city, tech_state_province, tech_postal_code, tech_country, tech_fax, tech_fax_ext, tech_phone, tech_phone_ext, registrar_IANA_id) " + 
				"    VALUES  " + 
				"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "	?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		PreparedStatement ps = null;
		
		File file = new File(path);
		
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("�ļ����ǿյ�!");
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                       // System.out.println("�ļ���:" + file2.getAbsolutePath());
                        test_2(file2.getAbsolutePath());
                    } else {
                      //  System.out.println("�ļ�:" + file2.getAbsolutePath());
                        String p = file2.getAbsolutePath();
                        if(p.endsWith(".csv")) {
                        	
                        	File csv = new File(p);  // CSV�ļ�·��
                    	    BufferedReader br = null;
                    	    try{
                    	        br = new BufferedReader(new FileReader(csv));
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
                    	                //System.out.println(everyLine);
                    	                allString.add(everyLine);
                    	            }
                    	            
                    	            // System.out.println("csv���������������"+allString.size());
                    	            for (int i = 1; i < allString.size(); i++) {
                						try {
                							String string = allString.get(i);
                							// String s1 ="\"08500cp.com\",\"eNom, Inc.\",\"noreply@data-protected.net\",\"whois.enom.com\",\"DNS1.NAME-SERVICES.COM|DNS2.NAME-SERVICES.COM|DNS3.NAME-SERVICES.COM|DNS4.NAME-SERVICES.COM|DNS5.NAME-SERVICES.COM|\",\"2018-06-21T08:01:48Z\",\"2018-06-21T08:01:49Z\",\"2019-06-21T08:01:48Z\",\"clientTransferProhibited\",\"Data Protected Data Protected\",\"Data Protected\",\"123 Data Protected\",\"\",\"\",\"\",\"Kirkland\",\"WA\",\"98033\",\"UNITED STATES\",\"10000000000\",\"\",\"10000000000\",\"\",\"noreply@data-protected.net\",\"Data Protected\",\"123 Data Protected\",\"\",\"\",\"\",\"Kirkland\",\"WA\",\"98033\",\"UNITED STATES\",\"10000000000\",\"\",\"10000000000\",\"\",\"\",\"\",\"\",\"\",\"\",\"Kirkland\",\"WA\",\"98033\",\"UNITED STATES\",\"10000000000\",\"\",\"10000000000\",\"\",\"\",\"\",\"\",\"\",";
                							String[] split = string.split("\",\"");
                							conn =DriverManager.getConnection(url,username,password);   //��ȡ����
                							ps = conn.prepareStatement(sql);
                							
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
                							
                							//�������
                							int executeUpdate = ps.executeUpdate();
                							//����ʧ�ܣ����ӡ���ļ���Ϣ
                							if(executeUpdate<0) {
                								
                								//��ӡʧ����Ϣ
                								File catchFile = new File("C:\\Users\\Yao\\Desktop\\error.txt");
                								
                								FileOutputStream fos = new FileOutputStream(catchFile,true);
                								
                								//�ļ�λ��
                								String errorFile = "�ļ�λ�ã�"+p+" \r\n";
                								byte[] errorFileBytes = errorFile.getBytes();
                								
                								//�����ַ���
                								String errorString = "�����ַ���:"+  allString.get(i) +"   \r\n";
                								byte[] errorStringBytes = errorString.getBytes();
                								//��ӻ���
                								String newLine = "\r\n";
                								
                								fos.write(errorStringBytes);
                								fos.write(errorFileBytes);
                								fos.write(newLine.getBytes());
                								
                								if(fos!=null) {
                									fos.close();
                								}
                								
                								
                								System.out.println("����ļ���"+p);
                    							System.out.println("�����ַ���:"+allString.get(i));
                    							System.out.println();
                							}
                							
                							//�ر�ps��
                							if(ps!=null) {
                								ps.close();
                							}
                							
                							//�ر�conn��
                							if(conn!=null) {
                								conn.close();
                							}
                							
                						}catch(Exception e) {
                							//��ӡʧ�ܵ��ļ���Ϣ
                							//e.printStackTrace();
                							File catchFile = new File("");
                							FileOutputStream fos = new FileOutputStream(catchFile,true);
                							
                							//�ļ�λ��
                							String errorFile = "�ļ�λ�ã�"+p;
                							byte[] errorFileBytes = errorFile.getBytes();
                							
                							//�����ַ���
                							String errorString = "�����ַ���:"+allString.get(i);
                							byte[] errorStringBytes = errorString.getBytes();
                							
                							fos.write(errorStringBytes);
                							fos.write(errorFileBytes);
                							
                						}
                					}
                    	    } catch (IOException e){
                    	        e.printStackTrace();
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
