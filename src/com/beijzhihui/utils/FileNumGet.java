package com.beijzhihui.utils;

import java.io.File;

public class FileNumGet {
		static int countNum = 0;
		//遍历文件数量
		public static int test_2(String path) throws Exception {
			
			File file = new File(path);
			
	        if (file.exists()) {
	            File[] files = file.listFiles();
	            if (files.length == 0) {
	                System.out.println("文件夹是空的!");
	                return 0;
	            } else {
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                       // System.out.println("文件夹:" + file2.getAbsolutePath());
	                        test_2(file2.getAbsolutePath());
	                    } else {
	                       // System.out.println("文件:" + file2.getAbsolutePath());
	                        String p = file2.getAbsolutePath();
	                        
	                        if(p.endsWith(".csv")) {
	                        	System.out.println(countNum+"  "+p);
	                        	countNum+=1;
	                        	//System.out.println(p);
	                        }
	                    }
	                }
	            }
	        } else {
	            System.out.println("文件不存在!");
	        }
			return countNum;
		}
		
		public static void main(String[] args) throws Exception {
			String path ="C:\\Users\\Yao\\Desktop\\新建文件夹 (2)";
			int tes = test_2(path);
			System.out.println(tes);
		}
}
