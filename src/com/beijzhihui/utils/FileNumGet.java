package com.beijzhihui.utils;

import java.io.File;

public class FileNumGet {
		static int countNum = 0;
		//�����ļ�����
		public static int test_2(String path) throws Exception {
			
			File file = new File(path);
			
	        if (file.exists()) {
	            File[] files = file.listFiles();
	            if (files.length == 0) {
	                System.out.println("�ļ����ǿյ�!");
	                return 0;
	            } else {
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                       // System.out.println("�ļ���:" + file2.getAbsolutePath());
	                        test_2(file2.getAbsolutePath());
	                    } else {
	                       // System.out.println("�ļ�:" + file2.getAbsolutePath());
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
	            System.out.println("�ļ�������!");
	        }
			return countNum;
		}
		
		public static void main(String[] args) throws Exception {
			String path ="C:\\Users\\Yao\\Desktop\\�½��ļ��� (2)";
			int tes = test_2(path);
			System.out.println(tes);
		}
}
