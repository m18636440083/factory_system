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
 * Servlet implementation class Worehouse_product_materalFindByHno
 */
@WebServlet("/Worehouse_product_materalFindByHno")
public class Worehouse_product_materalFindByHno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Worehouse_product_materalFindByHno() {
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
		WorehouseTwo worehouseTwo = dao.findByHno(hno);
		System.out.println(worehouseTwo);
		request.setAttribute("ms", worehouseTwo);
		request.getRequestDispatcher("/admin/WorehouseFindByHno.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
