package com.beijzhihui.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beijzhihui.utils.FileNumGet;
import com.beijzhihui.utils.ForEachFile;
import com.beijzhihui.utils.ReadExcel;
import com.beijzhihui.utils.ZipRealse;

public class MainStart {
	static int directoryNum = 0;
	static int fileNum =0;
	static int zipNum =0;
	static int csvNum =0;
	static int otherNum =0;
	static List<String> list = new ArrayList<String>();
	static Map<Object,Object> map = new HashMap<Object,Object>();
	public static void main(String[] args) throws Exception {
		
		//����Ҫ��ѹ��Ŀ���ļ�
		String path ="C:\\Users\\Yao\\Desktop\\�½��ļ��� (2)";
		
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("==================��ʼɨ���ѹ�ļ�===============");
		System.out.println("==================��ʼɨ���ѹ�ļ�===============");
		System.out.println("=========================================");
		System.out.println("=========================================");
		// 2000���������
		Thread.sleep(2000);
		//ZipRealse.test_1(path);
		
		
		//2000�����ͳ��������
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("==================��ʼͳ���ļ�����===============");
		System.out.println("==================��ʼͳ���ļ�����===============");
		System.out.println("=========================================");
		System.out.println("=========================================");
		Thread.sleep(2000);
		//���ɨ������
		int test_2 = FileNumGet.test_2(path);
		System.out.println("csv�ļ��ܼ��ǣ�"+test_2);
		
		//ִ�в���
		ForEachFile.test_2(path);
		
	}
}
