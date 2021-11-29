package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.dao.FactoryDao;
import com.factory.dao.impl.FactoryDaoImpl;

/**
 * Servlet implementation class DeleteMaterical
 */
@WebServlet("/DeleteFactory")
public class DeleteFactory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFactory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		FactoryDao fDao = new FactoryDaoImpl();
		int flag = fDao.deleteFactory(fname);
		if(flag > 0) {
			response.sendRedirect(request.getContextPath()+"/FactoryFindAll");
		}
		else {
			response.sendRedirect(request.getContextPath()+"/error.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
