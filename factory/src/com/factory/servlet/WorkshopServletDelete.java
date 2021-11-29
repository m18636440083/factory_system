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

import com.factory.dao.WorkshopDao;
import com.factory.dao.impl.WorkshopDaoImpl;


/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
@WebServlet("/WorkshopServletDelete")
public class WorkshopServletDelete extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.getWriter().append("Served at: ").append(req.getContextPath());
		int wno=Integer.parseInt(req.getParameter("wno"));
		WorkshopDao dao=new WorkshopDaoImpl();
		boolean re=dao.delete(wno);
		if(re) {
			//System.out.println("执行成功");
			//重定向
			resp.sendRedirect(req.getContextPath()+"/WorkshopServletList");
		}
		else {
			//System.out.println("执行失败");
			resp.sendRedirect(req.getContextPath()+"/error.html");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	/**
	 * 
	 */
	public WorkshopServletDelete() {
		super();
		// TODO Auto-generated constructor stub
	}

}
