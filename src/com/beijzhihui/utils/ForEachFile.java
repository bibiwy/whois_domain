package com.beijzhihui.utils;

import java.io.File;
import java.util.List;

public class ForEachFile {
	
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
	                       // System.out.println("�ļ���:" + file2.getAbsolutePath());
	                        test_2(file2.getAbsolutePath());
	                    } else {
	                       // System.out.println("�ļ�:" + file2.getAbsolutePath());
	                        String p = file2.getAbsolutePath();
	                        if(p.endsWith(".csv")) {
	                        	//ͨ���ļ�·������ȡ�ļ�����
	                        	ReadExcel.method_excel(p);
	                        }
	                    }
	                }
	            }
	        } else {
	            System.out.println("�ļ�������!");
	        }
		}
}
