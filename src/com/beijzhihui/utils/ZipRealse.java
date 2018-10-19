package com.beijzhihui.utils;

import java.io.File;

// 解压zip格式
public class ZipRealse {
	//文件的解压
	public static void test_1(String path) throws Exception {
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                       // System.out.println("文件夹:" + file2.getAbsolutePath());
                        test_1(file2.getAbsolutePath());
                    } else {
                       // System.out.println("文件:" + file2.getAbsolutePath());
                        String p = file2.getAbsolutePath();
                        int lastIndexOf = p.lastIndexOf(".");
                        String substring = p.substring(lastIndexOf+1, p.length());
                        if(substring.equalsIgnoreCase("zip")) {
                        	File zipFile = new File(p);
                        	//输出路径
                        	System.out.println(p.substring(0, p.lastIndexOf("\\")));
                        	// 解压到同级目录中
                        	String path1 = p.substring(0, p.lastIndexOf("\\"))+"\\";
                        	//执行解压
                        	UZipFile.unZipFiles(zipFile, path1);
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
	}
	
	public static void main(String[] args) {
		
	}
}
