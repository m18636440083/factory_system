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
@WebServlet("/WorkshopServletUpdate")
public class WorkshopServletUpdate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String s_wno = req.getParameter("wno");
		int wno = 0;
		if ("".equals(s_wno) || s_wno == null) {
			System.out.println(s_wno + "没有值");
			return;
		} else {
			wno = Integer.parseInt(s_wno);
		}
		String wmanager = req.getParameter("wmanager");
		String wlocation = req.getParameter("wlocation");
		String wtel = req.getParameter("wtel");
		String wremark = req.getParameter("wremark");
		WorkshopDao dao = new WorkshopDaoImpl();
		Workshop workshop = new Workshop(wno, wmanager, wlocation, wtel, wremark);

		boolean re = dao.update(workshop);
		if (re) {
			System.out.println("执行成功");
			// 重定向
			resp.sendRedirect(req.getContextPath() + "/WorkshopServletList");
		} else {
			// System.out.println("ִ执行失败");
			resp.sendRedirect(req.getContextPath() + "/error.html");
		}
	}

	/**
	 * 
	 */
	public WorkshopServletUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
