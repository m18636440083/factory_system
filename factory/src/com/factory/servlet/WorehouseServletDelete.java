package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.dao.ManagerDao;
import com.factory.dao.WorkshopDao;
import com.factory.dao.impl.ManagerDaoImpl;
import com.factory.dao.impl.WorkshopDaoImpl;

/**
 * Servlet implementation class WorehouseServletDelete
 */
@WebServlet("/WorehouseServletDelete")
public class WorehouseServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorehouseServletDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id=Integer.parseInt(request.getParameter("id"));
		ManagerDao dao=new ManagerDaoImpl();
		boolean re=dao.delete(id);
		if(re) {
			//System.out.println("执行成功");
			//重定向
			response.sendRedirect(request.getContextPath()+"/ManagerServletList");
		}
		else {
			//System.out.println("执行失败");
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
