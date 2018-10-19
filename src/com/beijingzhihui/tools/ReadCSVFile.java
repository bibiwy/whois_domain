package com.beijingzhihui.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// 遍历读取文件
public class ReadCSVFile {
	public static void main(String[] args) {
		String path ="E:\\北京锦岳智慧有限公司\\Whois-db数据库\\whoisData1\\WhoisDEMO\\WhoisData\\cctlds_regular\\2000.hu\\11.csv";
		method_excel(path);
	}
	
	//遍历文件读取文件内容
	public static  void test_2(String path) throws Exception {
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                         System.out.println("文件夹:" + file2.getAbsolutePath());
                         test_2(file2.getAbsolutePath());
                    } else {
                        // System.out.println("文件:" + file2.getAbsolutePath());
                    	if(file2.getAbsolutePath().endsWith("1.csv")) {
                    			
                    	}
                    	
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
	}
			
	 public  static void method_excel(String path) {
    	    File csv = new File(path);  // CSV文件路径
    	    BufferedReader br = null;
    	    try{
    	        br = new BufferedReader(new FileReader(csv));
    	    } catch (FileNotFoundException e){
    	        e.printStackTrace();
    	    }
    	    String line = "";
    	    try {
    	            //读取到的内容给line变量
    	            while ((line = br.readLine()) != null){
    	                System.out.println(line);
    	                
    	               /* String[] split = line.split("\",\"");
    	                for (int i = 0; i < split.length; i++) {
							System.out.println(split[i]);
						}*/
    	                
    	            }
    	           // System.out.println("csv表格中所有行数："+allString.size());
    	    } catch (IOException e){
    	        e.printStackTrace();
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
