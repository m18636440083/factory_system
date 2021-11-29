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
 * Servlet implementation class WorehouseServletAdd
 */
@WebServlet("/WorehouseServletAdd")
public class WorehouseServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorehouseServletAdd() {
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
        int hno = Integer.parseInt(request.getParameter("hno"));
        int hmanagerId = Integer.parseInt(request.getParameter("hmanagerId"));
        String hmanagerName = request.getParameter("hmanagerName");
        String htel = request.getParameter("htel");
        String hlocation = request.getParameter("hlocation");
        String hremark = request.getParameter("hremark");
        Worehouse worehouse = new Worehouse(hno, hmanagerId, hmanagerName, htel, hlocation, hremark);
        WorehouseDao dao = new WorehouseDaoImpl();
        boolean re = dao.add(worehouse);
        if (re) {
        	response.sendRedirect(request.getContextPath()+"/WorehouseServletList");
        }
		else {
			//System.out.println("Ö´ÐÐÊ§°Ü");
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
