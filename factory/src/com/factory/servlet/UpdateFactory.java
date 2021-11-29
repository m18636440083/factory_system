package com.factory.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Factory;
import com.factory.dao.FactoryDao;
import com.factory.dao.impl.FactoryDaoImpl;

/**
 * Servlet implementation class UpdateMatercial
 */
@WebServlet("/UpdateFactory")
public class UpdateFactory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFactory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String fname  = request.getParameter("fname");
		String fleader = request.getParameter("fleader");
		String fintroduction = request.getParameter("fintroduction");
		String  fregistertTime = request.getParameter("fregistertTime");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date enterdate = null;
		try {
			enterdate = df.parse(fregistertTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String flocation = request.getParameter("flocation");
		Factory factory = new Factory(fname, fleader, fintroduction, new java.sql.Date(enterdate.getTime()), flocation);
		FactoryDao fDao = new FactoryDaoImpl();
		int flag = fDao.updateFactory(factory);
		if(flag > 0) {
			System.out.println("修改成功");
			response.sendRedirect(request.getContextPath()+"/FactoryFindAll");
		}
		else {
			System.out.println("修改失败");
			response.sendRedirect(request.getContextPath()+"/error.html");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
