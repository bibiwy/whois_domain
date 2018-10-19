package com.beijzhihui.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beijzhihui.bean.WhoIsDemo;

public class InsertBean {

	public static void insertEntity(WhoIsDemo who) {
		
		Configuration conf=null;
		SessionFactory sf=null;
		Session session=null;
		Transaction tx=null;
		try {
			//1、读取配置文件
			conf=new Configuration().configure();
			//2、创建SessionFactory
			sf=conf.buildSessionFactory();
			//3、打开Session
			session=sf.openSession();
			//4、开始一个事务
			tx=session.beginTransaction();
			//5、持久化操作
			session.save(who);
			//6、提交事务
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			//6、回滚事务
			tx.rollback();
		}finally{
			//7、关闭Session
			if (session!=null) {
				session.close(); 
			}
		}
	}
}
