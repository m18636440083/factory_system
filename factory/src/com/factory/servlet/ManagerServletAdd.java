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
 * Servlet implementation class ManagerServletAdd
 */
@WebServlet("/ManagerServletAdd")
public class ManagerServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServletAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
        request.setCharacterEncoding( "utf-8" );
        response.setContentType( "text/html;charset=utf-8" );
        int id = Integer.parseInt(request.getParameter("id"));
        String mname = request.getParameter("mname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String mtel = request.getParameter("mtel");
        String memail = request.getParameter("memail");
        int mcategory = Integer.parseInt(request.getParameter("mcategory"));
        String mremark = request.getParameter("mremark");
        Manager manager = new Manager(id, mname, username, password, mtel, memail, mcategory, mremark);
        ManagerDao dao = new ManagerDaoImpl();
        boolean re = dao.add(manager);
        if (re) {
        	response.sendRedirect(request.getContextPath()+"/ManagerServletList");
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
