/*
 * 中北大学软件学院版权所有
 */
package com.factory.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Workshop;
import com.factory.dao.WorkshopDao;
import com.factory.dao.impl.WorkshopDaoImpl;



/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
@WebServlet("/WorkshopServletSelectByWno")
public class WorkshopServletSelectByWno extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s_wno=req.getParameter("wno");
		int wno=0;
		if("".equals(s_wno)||s_wno==null){
			System.out.println(s_wno+" 没有值ֵ");
			return;
		}
		else {
			wno=Integer.parseInt(s_wno);
		}
		WorkshopDao dao = new WorkshopDaoImpl();
		Workshop workshop = dao.selectWno(wno);
		
		req.setAttribute("ms", workshop);
		req.getRequestDispatcher("/admin/Workshop_update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	/**
	 * 
	 */
	public WorkshopServletSelectByWno() {
		super();
		// TODO Auto-generated constructor stub
	}

}
