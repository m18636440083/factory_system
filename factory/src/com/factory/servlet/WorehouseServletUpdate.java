package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Worehouse;
import com.factory.dao.WorehouseDao;
import com.factory.dao.impl.WorehouseDaoImpl;


/**
 * Servlet implementation class WorehouseServletUpdate
 */
@WebServlet("/WorehouseServletUpdate")
public class WorehouseServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorehouseServletUpdate() {
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
		String s_hno=request.getParameter("hno");
		int hno=0;
		if("".equals(s_hno)||s_hno==null){
			System.out.println(s_hno+" 没有值");
			return;
		}
		else {
			hno=Integer.parseInt(s_hno);
		}
		int hmanagerId=Integer.parseInt(request.getParameter("hmanagerId"));
		String hmanagerName=request.getParameter("hmanagerName");
		String htel=request.getParameter("htel");
		String hlocation=request.getParameter("hlocation");
		String hremark=request.getParameter("hremark");
		WorehouseDao dao = new WorehouseDaoImpl();
		Worehouse worehouse = new Worehouse(hno, hmanagerId, hmanagerName, htel, hlocation, hremark);
		
		boolean re = dao.update(worehouse);
		if(re) {
			System.out.println("执行成功");
			//重定向
			response.sendRedirect(request.getContextPath()+"/WorehouseServletList");
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
