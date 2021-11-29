package com.factory.test;

import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Manager;
import com.factory.bean.Workshop;
import com.factory.bean.WorkshopTwo;
import com.factory.dao.ManagerDao;
import com.factory.dao.WorkshopDao;
import com.factory.dao.impl.ManagerDaoImpl;
import com.factory.dao.impl.WorkshopDaoImpl;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ManagerDao dao = new ManagerDaoImpl();
//		List<Manager> list = new ArrayList<Manager>();
//		list = dao.findAll();
//		System.out.println(list);
		
		ManagerDao dao = new ManagerDaoImpl();
		Manager manager = new Manager(10, "425", "123456", "123456", "123321", "@qq.com", 2, "785");
		boolean k = dao.add(manager);
		System.out.println(k);
		
//		Manager manager = new Manager(3, "�żѺ�", "xiaohaohao", "123456", "123321", "163@qq.com", 2, "����");
//		boolean k = dao.update(manager);
//		System.out.println(k);
		
//		boolean k = dao.delete(1);
//		System.out.println(k);
		
//		Manager manager = new Manager();
//		manager = dao.findById(1);
//		System.out.println(manager);
		
//		Manager manager = new Manager();
//		manager = dao.login("xiaohaohao", "123456");
//		System.out.println(manager);
		
//		Workshop work = new Workshop(12,"自适应工厂","12","12","12","12");
//		WorkshopDao dao = new WorkshopDaoImpl();
//		boolean re = dao.add(work);
		
//		WorkshopDao dao = new WorkshopDaoImpl();
//		Workshop workshop = new Workshop(1, "张佳豪", "京城", "123", "而也一样");
//		boolean re = dao.update(workshop);
//		System.out.println(re);
	}

}
