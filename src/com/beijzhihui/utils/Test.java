package com.beijzhihui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	static Long countNum =0l;
	static Long countBBC =0L;
	
	public static void main(String[] args) throws Exception {
		//String username ="root";      //user
		//String password ="root";      //password
		//String url ="jdbc:mysql://localhost:3306/domain_db";   //url
		
		
		String username ="visualCheck";      //user
		String password ="w2S0tptlf0ViPEIthPcJ*lQ4h";      //password
		String url ="jdbc:mysql://47.94.44.247:3307/whois";   //url
		Driver driver = new com.mysql.jdbc.Driver();    //驱动
		DriverManager.registerDriver(driver);            //驱动的注册
		Connection  conn  = null;   //获取连接
		PreparedStatement ps = null;
    	
		String sql ="    INSERT " + 
				"    INTO " + 
				"        whois_domain " + 
				"        (domain, registrar, reg_email, registrar_whois_server, name_server, reg_date, updated_date, expir_date, domain_status, registrar_abuse_contact_email, reg_name, registrant_organization, registrant_street1, registrant_street2, registrant_street3, registrant_street4, registrant_city, registrant_state_province, registrant_postal_code, reg_country, reg_fax, registrant_fax_ext, registrar_abuse_contact_phone, registrant_phone_ext, adm_email, adm_name, admin_organization, administrativeContact_street1, administrativeContact_street2, administrativeContact_street3, administrativeContact_street4, admin_city, admin_state_province, admin_postal_code, adm_country, adm_fax, admin_fax_ext, adm_phone, admin_phone_ext, tech_email, tech_name, tech_organization, technicalContact_street1, technicalContact_street2, technicalContact_street3, technicalContact_street4, tech_city, tech_state_province, tech_postal_code, tech_country, tech_fax, tech_fax_ext, tech_phone, tech_phone_ext, registrar_IANA_id) " + 
				"    VALUES  " + 
				"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "	?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		
		//操作文件
		File file = new File("C:\\Users\\Yao\\Desktop\\error.txt");
		Map<String,String> map = new HashMap<String,String>();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String string = null;
		conn  = DriverManager.getConnection(url,username,password);   //获取连接
      	ps = conn.prepareStatement(sql);
		while ((string=br.readLine()) != null) {
			if(string.startsWith("错误")) {
				int indexOf = string.indexOf("\"");
				String str = string.substring(indexOf+1, string.length());
				String[] split = str.split("\",\"");
				
				for (int j = 0; j < split.length; j++) {
					// 消除最后一个字段的 , 字符
					if((j+1)!=split.length) {
						ps.setString(j+1, split[j].replace("\"", ""));
						
					}else {
						String newP =split[j].replace("\"", "");
						ps.setString(j+1, newP.replace(",", ""));
					}
					// 对字符串不满55长度的，赋值为空
					if(split.length!=55) {
						int a = split.length;
						for (int q =a ; q < 55; q++) {
							ps.setString(q+1, "");
						}
					}
					
					if(j==54) {
						split[j] = split[j].replace("\"", "");
					}
					countBBC++;
					ps.setString(j+1, split[j]);
				}
				ps.execute();
			}
		}
		System.out.println("over");
	}
	
	/*
	 * 
	 * 
	 * 
	 * SELECT MAX(id) FROM whois_domain

		DESC whois_domain
		4210758
	 */
}
