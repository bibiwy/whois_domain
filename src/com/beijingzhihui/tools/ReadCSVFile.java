package com.beijingzhihui.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// ������ȡ�ļ�
public class ReadCSVFile {
	public static void main(String[] args) {
		String path ="E:\\���������ǻ����޹�˾\\Whois-db���ݿ�\\whoisData1\\WhoisDEMO\\WhoisData\\cctlds_regular\\2000.hu\\11.csv";
		method_excel(path);
	}
	
	//�����ļ���ȡ�ļ�����
	public static  void test_2(String path) throws Exception {
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("�ļ����ǿյ�!");
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                         System.out.println("�ļ���:" + file2.getAbsolutePath());
                         test_2(file2.getAbsolutePath());
                    } else {
                        // System.out.println("�ļ�:" + file2.getAbsolutePath());
                    	if(file2.getAbsolutePath().endsWith("1.csv")) {
                    			
                    	}
                    	
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
	}
			
	 public  static void method_excel(String path) {
    	    File csv = new File(path);  // CSV�ļ�·��
    	    BufferedReader br = null;
    	    try{
    	        br = new BufferedReader(new FileReader(csv));
    	    } catch (FileNotFoundException e){
    	        e.printStackTrace();
    	    }
    	    String line = "";
    	    try {
    	            //��ȡ�������ݸ�line����
    	            while ((line = br.readLine()) != null){
    	                System.out.println(line);
    	                
    	               /* String[] split = line.split("\",\"");
    	                for (int i = 0; i < split.length; i++) {
							System.out.println(split[i]);
						}*/
    	                
    	            }
    	           // System.out.println("csv���������������"+allString.size());
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
