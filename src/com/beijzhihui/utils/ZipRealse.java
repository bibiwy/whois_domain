package com.beijzhihui.utils;

import java.io.File;

// ��ѹzip��ʽ
public class ZipRealse {
	//�ļ��Ľ�ѹ
	public static void test_1(String path) throws Exception {
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("�ļ����ǿյ�!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                       // System.out.println("�ļ���:" + file2.getAbsolutePath());
                        test_1(file2.getAbsolutePath());
                    } else {
                       // System.out.println("�ļ�:" + file2.getAbsolutePath());
                        String p = file2.getAbsolutePath();
                        int lastIndexOf = p.lastIndexOf(".");
                        String substring = p.substring(lastIndexOf+1, p.length());
                        if(substring.equalsIgnoreCase("zip")) {
                        	File zipFile = new File(p);
                        	//���·��
                        	System.out.println(p.substring(0, p.lastIndexOf("\\")));
                        	// ��ѹ��ͬ��Ŀ¼��
                        	String path1 = p.substring(0, p.lastIndexOf("\\"))+"\\";
                        	//ִ�н�ѹ
                        	UZipFile.unZipFiles(zipFile, path1);
                        }
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
	}
	
	public static void main(String[] args) {
		
	}
}
