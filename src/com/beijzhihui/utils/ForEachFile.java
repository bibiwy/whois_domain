package com.beijzhihui.utils;

import java.io.File;
import java.util.List;

public class ForEachFile {
	
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
	                       // System.out.println("文件夹:" + file2.getAbsolutePath());
	                        test_2(file2.getAbsolutePath());
	                    } else {
	                       // System.out.println("文件:" + file2.getAbsolutePath());
	                        String p = file2.getAbsolutePath();
	                        if(p.endsWith(".csv")) {
	                        	//通过文件路径来获取文件内容
	                        	ReadExcel.method_excel(p);
	                        }
	                    }
	                }
	            }
	        } else {
	            System.out.println("文件不存在!");
	        }
		}
}
