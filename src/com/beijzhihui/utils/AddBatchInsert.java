package com.beijzhihui.utils;

import java.io.File;
import java.util.LinkedList;

/*
 * 
 * 思路：
 * 1、遍历目标文件夹
 * 2、找到文件是：.scv的文件 的文件路径
 * 3、通过文件路径（文件）从表的第2行开始读（第一行是字段）
 * 4、对读取的字符串切割。（1）切割规则：","  （2）  字段数量55，则赋值，不满55则赋值为 null
 * 5
 * 
 * 效率：1分钟950条
 */

public class AddBatchInsert {
	
	//文件夹共有:4853,文件共有:843
	//文件夹共有:4302,文件共有:843
	//csv文件总计是：4302
	public static void main(String[] args) throws Exception {
		
			String path ="C:\\Users\\Yao\\Desktop\\新建文件夹 (3)";
	        int fileNum = 0, folderNum = 0;
	        File file = new File(path);
	        
	        
	        // 遍历文件  开始
	        if (file.exists()) {
	            LinkedList<File> list = new LinkedList<File>();
	            File[] files = file.listFiles();
	            for (File file2 : files) {
	                if (file2.isDirectory()) {
	                  //  System.out.println("文件夹:" + file2.getAbsolutePath());
	                    list.add(file2);
	                    folderNum++;
	                } else {
	                    System.out.println("文件:" + file2.getAbsolutePath());
	                    if(file2.getAbsolutePath().endsWith(".java")) {
	                    	 fileNum++;
	                    	 //找到了文件的地址
                        }
	                }
	            }
	            
	            File temp_file;
	            while (!list.isEmpty()) {
	                temp_file = list.removeFirst();
	                files = temp_file.listFiles();
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                        System.out.println("文件夹:" + file2.getAbsolutePath());
	                        list.add(file2);
	                        	folderNum++;
	                    } else {
	                    	//是csv的文件，则进入读取
	                        if(file2.getAbsolutePath().endsWith(".csv")) {
	                        	 fileNum++;
	                        }
	                        
	                    }
	                }
	            }
	        } else {
	            System.out.println("文件不存在!");
	        }
	        // 遍历结束
	        
	        
	        System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);

	
	}
}
