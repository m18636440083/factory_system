package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Manager;
import com.factory.bean.Worehouse;
import com.factory.dao.ManagerDao;
import com.factory.dao.WorehouseDao;
import com.factory.dao.impl.ManagerDaoImpl;
import com.factory.dao.impl.WorehouseDaoImpl;

/**
 * Servlet implementation class ManagerServletById
 */
@WebServlet("/ManagerServletById")
public class ManagerServletById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServletById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String m_id=request.getParameter("id");
		int id = 0;
		if("".equals(m_id)||m_id==null){
			return;
		}
		else {
			id=Integer.parseInt(m_id);
		}
		ManagerDao dao = new ManagerDaoImpl();
		Manager manager = new Manager();
		manager = dao.findById(id);
		
		request.setAttribute("m", manager);
		request.getRequestDispatcher("/admin/Manager_update.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
