package com.beijzhihui.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 若一个文件是zip格式则解压
 */
public class Test {
	
	public static void main(String[] args) throws Exception {
		
		//method1();
		method2();
		
		System.out.println("ok");
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		File catchFile = new File("C:\\Users\\Yao\\Desktop\\error.txt");
		
		FileOutputStream fos = new FileOutputStream(catchFile,true);
		
		//文件位置
		String errorFile = "文件位置："+"c:\\java_dev\\测试数据\\      \r\n";
		byte[] errorFileBytes = errorFile.getBytes();
		
		//错误字符串
		String errorString = "错误字符串:"+"1111111111111111111111   \r\n";
		byte[] errorStringBytes = errorString.getBytes();
		//添加换行
		String newLine = "\r\n";
		
		fos.write(errorStringBytes);
		fos.write(errorFileBytes);
		fos.write(newLine.getBytes());
		
		if(fos!=null) {
			fos.close();
		}
	}

	//测试字符串
	private static void method1() throws SQLException {
		String username ="root";      //user
		String password ="root";      //password
		String url ="jdbc:mysql://localhost:3306/domain_db";   //url
		Driver driver = new com.mysql.jdbc.Driver();    //驱动
		DriverManager.registerDriver(driver);            //驱动的注册
		Connection  conn = DriverManager.getConnection(url,username,password);   //获取连接
		String sql ="    INSERT " + 
				"    INTO " + 
				"        whoisdemo " + 
				"        (domain, registrar, reg_email, registrar_whois_server, name_server, reg_date, updated_date, expir_date, domain_status, registrar_abuse_contact_email, reg_name, registrant_organization, registrant_street1, registrant_street2, registrant_street3, registrant_street4, registrant_city, registrant_state_province, registrant_postal_code, reg_country, reg_fax, registrant_fax_ext, registrar_abuse_contact_phone, registrant_phone_ext, adm_email, adm_name, admin_organization, administrativeContact_street1, administrativeContact_street2, administrativeContact_street3, administrativeContact_street4, admin_city, admin_state_province, admin_postal_code, adm_country, adm_fax, admin_fax_ext, adm_phone, admin_phone_ext, tech_email, tech_name, tech_organization, technicalContact_street1, technicalContact_street2, technicalContact_street3, technicalContact_street4, tech_city, tech_state_province, tech_postal_code, tech_country, tech_fax, tech_fax_ext, tech_phone, tech_phone_ext, registrar_IANA_id) " + 
				"    VALUES  " + 
				"  (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "	?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" ;
		PreparedStatement ps = conn.prepareStatement(sql);
		
		String s2 ="\"warmies.biz\",\"1&1 Internet SE\",\"u.tippenhauer@t-online.de\",\"whois.neulevel.biz\",\"ns1054.ui-dns.org|ns1054.ui-dns.biz|ns1054.ui-dns.de|ns1054.ui-dns.com|\",\"2011-12-23T18:22:16Z\",\"2017-08-07T19:49:40Z\",\"2017-12-22T23:59:59Z\",\"clientTransferProhibited\",\"u.tippenhauer@t-online.de\",\"Ulrich Tippenhauer\",\"\",\"Goerresstr. 3\",\"\",\"\",\"\",\"Koeln\",\"\",\"50674\",\"GERMANY\",\"\",\"\",\"491712679112\",\"\",\"u.tippenhauer@t-online.de\",\"Ulrich Tippenhauer\",\"\",\"Goerresstr. 3\",\"\",\"\",\"\",\"Koeln\",\"\",\"50674\",\"GERMANY\",\"\",\"\",\"491712679112\",\"\",\"hostmaster@1und1.de\",\"Hostmaster EINSUNDEINS\",\"1&1 Internet AG\",\"Brauerstr. 48\",\"\",\"\",\"\",\"Karlsruhe\",\"\",\"76135\",\"GERMANY\",\"4972191374248\",\"\",\"497219600\",\"\",\"83\"\r\n" + 
				"";
		
		String[] split = s2.split("\",\"");
		
		for (int i = 0; i < split.length; i++) {
			ps.setString(i+1, split[i].replace("\"", ""));
			System.out.println(i+"  "+split[i].replace("\"", ""));
		}
		if(split.length!=55) {
			int a = split.length;
			for (int i = a; a < 55; a++) {
				ps.setString(a+1, "");
				
				System.out.println("进入"+(a+1));
			}
		}
		
		
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
	}
}
