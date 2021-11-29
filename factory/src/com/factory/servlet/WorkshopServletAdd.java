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

import com.factory.bean.Worehouse;
import com.factory.bean.Workshop;
import com.factory.dao.WorkshopDao;
import com.factory.dao.impl.WorkshopDaoImpl;

/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
@WebServlet("/WorkshopServletAdd")
public class WorkshopServletAdd extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		int wno = Integer.parseInt(req.getParameter("wno"));
		String fname = req.getParameter(req.getParameter("fname"));
		String wmanager = req.getParameter("wmanager");
		String wtel = req.getParameter("wtel");
		String wlocation = req.getParameter("wlocation");
		String wremark = req.getParameter("wremark");
		Workshop workshop = new Workshop(wno, "自适应工厂", wmanager, wtel, wlocation, wremark);
		WorkshopDao dao = new WorkshopDaoImpl();
		boolean re = dao.add(workshop);
		if (re) {
			resp.sendRedirect(req.getContextPath() + "/WorkshopServletList");
		} else {
			// System.out.println("ִ执行失败");
			resp.sendRedirect(req.getContextPath() + "/error.html");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
