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
			//1����ȡ�����ļ�
			conf=new Configuration().configure();
			//2������SessionFactory
			sf=conf.buildSessionFactory();
			//3����Session
			session=sf.openSession();
			//4����ʼһ������
			tx=session.beginTransaction();
			//5���־û�����
			session.save(who);
			//6���ύ����
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			//6���ع�����
			tx.rollback();
		}finally{
			//7���ر�Session
			if (session!=null) {
				session.close(); 
			}
		}
	}
}
