package com.beijzhihui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beijzhihui.bean.WhoIsDemo;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {

		//读取文件来返回list集合的数据。表中的一行数据
	    public  static void method_excel(String path) {
	    	WhoIsDemo whoIsDemo = null;
    	    File csv = new File(path);  // CSV文件路径
    	    BufferedReader br = null;
    	    try{
    	        br = new BufferedReader(new FileReader(csv));
    	    } catch (FileNotFoundException e){
    	        e.printStackTrace();
    	    }
    	    String line = "";
    	    List<String> allString = null;
    	    String everyLine = "";
    	    try {
    	            allString = new ArrayList<>();
    	            //读取到的内容给line变量
    	            while ((line = br.readLine()) != null){
    	                everyLine = line;
    	               // System.out.println(everyLine);
    	                allString.add(everyLine);
    	            }
    	           // System.out.println("csv表格中所有行数："+allString.size());
    	    } catch (IOException e){
    	        e.printStackTrace();
    	    }finally {
				if(br!=null) {
					try {
						br.close();
					} catch (IOException e) {
						System.out.println("流关闭失败");
					}
				}
			}
	    }
	    
	    
	    
	    
	    
        //2:测试
	    public static void main(String[] args) {
	    		String path ="C:\\Users\\Yao\\Desktop\\新建文件夹 (2)\\WhoisDEMO\\WhoisData\\regular\\aaa\\1.csv";
	    		WhoIsDemo whoIsDemo = null;
	    	    File csv = new File(path);  // CSV文件路径
	    	    BufferedReader br = null;
	    	    try{
	    	        br = new BufferedReader(new FileReader(csv));
	    	    } catch (FileNotFoundException e){
	    	        e.printStackTrace();
	    	    }
	    	    String line = "";
	    	    List<String> allString = null;
	    	    String everyLine = "";
	    	    try {
	    	            allString = new ArrayList<>();
	    	            //读取到的内容给line变量
	    	            while ((line = br.readLine()) != null){
	    	                everyLine = line;
	    	                System.out.println(everyLine);
	    	                String[] split = everyLine.split("\",\"");
	    	                for (int i = 0; i < split.length; i++) {
								System.out.println(i+"  =="+split[i]);
							}
	    	                allString.add(everyLine);
	    	            }
	    	            System.out.println("csv表格中所有行数："+allString.size());
	    	            
	    	    } catch (IOException e){
	    	        e.printStackTrace();
	    	    }
		}
	}
