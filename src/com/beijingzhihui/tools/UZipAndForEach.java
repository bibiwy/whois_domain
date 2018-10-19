package com.beijingzhihui.tools;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
// 遍历 +解压 文件
public class UZipAndForEach {
	
	public static long count = 0l;
	
	public static void main(String[] args) throws Exception {
		// 这里设置文件的路径
		System.out.println("程序开始执行=============");
		String path ="C:\\Users\\Yao\\Desktop\\cctlds_regular\\";
		
		
		test_2(path);
		System.out.println("本次总计：151个压缩包。共解压："+count+"个压缩包");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println("程序执行完毕=============");
		
		
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
                         // 解压文件
                    	if(file2.getAbsolutePath().endsWith(".zip")) {
                    		 UZipFile.unZipFiles(file2.getAbsolutePath(), path);
                    		 count++;
                    	}
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
	}
}
