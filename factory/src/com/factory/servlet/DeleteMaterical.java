package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.dao.MaterialDao;
import com.factory.dao.impl.MatericalDaoImpl;

/**
 * Servlet implementation class DeleteMaterical
 */
@WebServlet("/DeleteMaterical")
public class DeleteMaterical extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMaterical() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int mno = Integer.parseInt(request.getParameter("mno"));
		MaterialDao mDao = new MatericalDaoImpl();
		int flag = mDao.deleteMaterial(mno);
		if(flag > 0) {
			response.sendRedirect(request.getContextPath()+"/MatericalFindAll");
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
