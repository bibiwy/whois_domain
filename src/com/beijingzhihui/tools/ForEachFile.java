package com.beijingzhihui.tools;

//遍历文件
import java.io.File;

public class ForEachFile {
	
		public static void main(String[] args) throws Exception {
			System.out.println("程序开始");
			//getPath("C:\\Users\\Yao\\Desktop\\未来\\note\\Java\\框架");
			getPath("C:\\Users\\Yao\\Desktop\\cctlds_regular");
			System.out.println("程序结束");
		}
	
	
		//目录名
		public static  void  getPath(String path) throws Exception {
			File file = new File(path);
	        if (file.exists()) {
	            File[] files = file.listFiles();
	            if (files.length == 0) {
	                System.out.println("文件夹是空的!");
	            } else {
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                    	 String name = file2.getName();
	                    	 System.out.println(name);
	                         //System.out.println("文件夹:" + file2.getAbsolutePath());
	                         getPath(file2.getAbsolutePath());
	                    } else {
	                         //System.out.println("文件:" + file2.getAbsolutePath());
	                    }
	                }
	            }
	        } else {
	            System.out.println("文件不存在!");
	        }
		}
}
