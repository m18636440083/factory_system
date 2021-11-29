package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Worehouse;
import com.factory.bean.WorehouseTwo;
import com.factory.dao.WorehouseDao;
import com.factory.dao.impl.WorehouseDaoImpl;

/**
 * Servlet implementation class WorehouseServletFindByHno
 */
@WebServlet("/WorehouseServletSelectByHno")
public class WorehouseServletSelectByHno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorehouseServletSelectByHno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String s_hno=request.getParameter("hno");
		int hno=0;
		if("".equals(s_hno)||s_hno==null){
			System.out.println(s_hno+" Ã»ÓÐÖµ");
			return;
		}
		else {
			hno=Integer.parseInt(s_hno);
		}
		WorehouseDao dao = new WorehouseDaoImpl();
		Worehouse worehouse = dao.selectHno(hno);
		
		request.setAttribute("m", worehouse);
		request.getRequestDispatcher("/admin/Worehouse_update.jsp").forward(request, response);
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
