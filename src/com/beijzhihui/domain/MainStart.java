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
		
		//输入要解压的目标文件
		String path ="C:\\Users\\Yao\\Desktop\\新建文件夹 (2)";
		
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("==================开始扫描解压文件===============");
		System.out.println("==================开始扫描解压文件===============");
		System.out.println("=========================================");
		System.out.println("=========================================");
		// 2000毫秒后启动
		Thread.sleep(2000);
		//ZipRealse.test_1(path);
		
		
		//2000毫秒后统计数据量
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("==================开始统计文件数量===============");
		System.out.println("==================开始统计文件数量===============");
		System.out.println("=========================================");
		System.out.println("=========================================");
		Thread.sleep(2000);
		//输出扫描数量
		int test_2 = FileNumGet.test_2(path);
		System.out.println("csv文件总计是："+test_2);
		
		//执行插入
		ForEachFile.test_2(path);
		
	}
}
