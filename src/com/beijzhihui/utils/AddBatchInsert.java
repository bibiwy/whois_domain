package com.beijzhihui.utils;

import java.io.File;
import java.util.LinkedList;

/*
 * 
 * ˼·��
 * 1������Ŀ���ļ���
 * 2���ҵ��ļ��ǣ�.scv���ļ� ���ļ�·��
 * 3��ͨ���ļ�·�����ļ����ӱ�ĵ�2�п�ʼ������һ�����ֶΣ�
 * 4���Զ�ȡ���ַ����и��1���и����","  ��2��  �ֶ�����55����ֵ������55��ֵΪ null
 * 5
 * 
 * Ч�ʣ�1����950��
 */

public class AddBatchInsert {
	
	//�ļ��й���:4853,�ļ�����:843
	//�ļ��й���:4302,�ļ�����:843
	//csv�ļ��ܼ��ǣ�4302
	public static void main(String[] args) throws Exception {
		
			String path ="C:\\Users\\Yao\\Desktop\\�½��ļ��� (3)";
	        int fileNum = 0, folderNum = 0;
	        File file = new File(path);
	        
	        
	        // �����ļ�  ��ʼ
	        if (file.exists()) {
	            LinkedList<File> list = new LinkedList<File>();
	            File[] files = file.listFiles();
	            for (File file2 : files) {
	                if (file2.isDirectory()) {
	                  //  System.out.println("�ļ���:" + file2.getAbsolutePath());
	                    list.add(file2);
	                    folderNum++;
	                } else {
	                    System.out.println("�ļ�:" + file2.getAbsolutePath());
	                    if(file2.getAbsolutePath().endsWith(".java")) {
	                    	 fileNum++;
	                    	 //�ҵ����ļ��ĵ�ַ
                        }
	                }
	            }
	            
	            File temp_file;
	            while (!list.isEmpty()) {
	                temp_file = list.removeFirst();
	                files = temp_file.listFiles();
	                for (File file2 : files) {
	                    if (file2.isDirectory()) {
	                        System.out.println("�ļ���:" + file2.getAbsolutePath());
	                        list.add(file2);
	                        	folderNum++;
	                    } else {
	                    	//��csv���ļ���������ȡ
	                        if(file2.getAbsolutePath().endsWith(".csv")) {
	                        	 fileNum++;
	                        }
	                        
	                    }
	                }
	            }
	        } else {
	            System.out.println("�ļ�������!");
	        }
	        // ��������
	        
	        
	        System.out.println("�ļ��й���:" + folderNum + ",�ļ�����:" + fileNum);

	
	}
}
