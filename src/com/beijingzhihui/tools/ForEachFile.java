package com.beijingzhihui.tools;

//�����ļ�
import java.io.File;

public class ForEachFile {
	
		public static void main(String[] args) throws Exception {
			System.out.println("����ʼ");
			//getPath("C:\\Users\\Yao\\Desktop\\δ��\\note\\Java\\���");
			getPath("C:\\Users\\Yao\\Desktop\\cctlds_regular");
			System.out.println("�������");
		}
	
	
		//Ŀ¼��
		public static  void  getPath(String path) throws Exception {
			File file = new File(path);
	        if (file.exists()) {
	            File[] files = file.listFiles();
	            if (files.length == 0) {
	                System.out.println("�ļ����ǿյ�!");
	            } else {
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                    	 String name = file2.getName();
	                    	 System.out.println(name);
	                         //System.out.println("�ļ���:" + file2.getAbsolutePath());
	                         getPath(file2.getAbsolutePath());
	                    } else {
	                         //System.out.println("�ļ�:" + file2.getAbsolutePath());
	                    }
	                }
	            }
	        } else {
	            System.out.println("�ļ�������!");
	        }
		}
}
