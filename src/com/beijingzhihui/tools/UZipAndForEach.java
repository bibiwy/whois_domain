package com.beijingzhihui.tools;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
// ���� +��ѹ �ļ�
public class UZipAndForEach {
	
	public static long count = 0l;
	
	public static void main(String[] args) throws Exception {
		// ���������ļ���·��
		System.out.println("����ʼִ��=============");
		String path ="C:\\Users\\Yao\\Desktop\\cctlds_regular\\";
		
		
		test_2(path);
		System.out.println("�����ܼƣ�151��ѹ����������ѹ��"+count+"��ѹ����");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println("����ִ�����=============");
		
		
	}
	
	
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
                          System.out.println("�ļ���:" + file2.getAbsolutePath());
                          test_2(file2.getAbsolutePath());
                    } else {
                         // System.out.println("�ļ�:" + file2.getAbsolutePath());
                         // ��ѹ�ļ�
                    	if(file2.getAbsolutePath().endsWith(".zip")) {
                    		 UZipFile.unZipFiles(file2.getAbsolutePath(), path);
                    		 count++;
                    	}
                    }
                }
            }
        } else {
            System.out.println("�ļ�������!");
        }
	}
}
