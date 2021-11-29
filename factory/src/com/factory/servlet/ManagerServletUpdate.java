package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Manager;
import com.factory.dao.ManagerDao;
import com.factory.dao.impl.ManagerDaoImpl;

/**
 * Servlet implementation class ManagerServletUpdate
 */
@WebServlet("/ManagerServletUpdate")
public class ManagerServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServletUpdate() {
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
		String m_id=request.getParameter("id");
		int id=0;
		if("".equals(m_id)||m_id==null){
			System.out.println("空空空");
			return;
		}
		else {
			id=Integer.parseInt(m_id);
		}
		String mname=request.getParameter("mname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String mtel=request.getParameter("password");
		String memail=request.getParameter("password");
		int mcategory = Integer.parseInt(request.getParameter("mcategory"));
		String mremark=request.getParameter("mremark");
		ManagerDao dao = new ManagerDaoImpl();
		Manager manager = new Manager(id, mname, username, password, mtel, memail, mcategory, mremark);
		
		boolean re = dao.update(manager);
		if(re) {
			response.sendRedirect(request.getContextPath()+"/ManagerServletList");
		}
		else {
			//System.out.println("ִ��ʧ��");
			response.sendRedirect(request.getContextPath()+"/error.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
