/*
 * 中北大学软件学院版权所有
 */
package com.factory.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/WorkshopServletList")
public class WorkshopServletList extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Workshop> list = new ArrayList<Workshop>();
		WorkshopDao dao = new WorkshopDaoImpl();
		list = dao.findAll();
		System.out.println(list);
		req.setAttribute("ms", list);
		req.getRequestDispatcher("/admin/workshop_list.jsp").forward(req, resp);	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
