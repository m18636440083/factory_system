package com.factory.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Factory;
import com.factory.dao.FactoryDao;
import com.factory.dao.impl.FactoryDaoImpl;

/**
 * Servlet implementation class FindProductId
 */
@WebServlet("/FindFactoryFname")
public class FindFactoryFname extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindFactoryFname() {
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
		String f_name = request.getParameter("fname");
		String fname ="";
		if("".equals(f_name)||f_name==null){
			System.out.println(f_name +" 为空ֵ");
		}
		else {
			fname = f_name;
		}
		FactoryDao fDao = new FactoryDaoImpl();
		Factory factory = fDao.findFactorys(fname);
		request.setAttribute("factory", factory);
		request.getRequestDispatcher("/admin/updateFactory.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
