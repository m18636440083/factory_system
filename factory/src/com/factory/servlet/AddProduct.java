package com.factory.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Product;
import com.factory.dao.ProductDao;
import com.factory.dao.impl.ProductDaoImpl;

/**
 * Servlet implementation class AddMaterical
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		int pno = Integer.parseInt(request.getParameter("pno"));
		int hno = Integer.parseInt(request.getParameter("hno"));
		String pname = request.getParameter("pname");
		int pprice = Integer.parseInt(request.getParameter("pprice"));
		int wnumber = Integer.parseInt(request.getParameter("wnumber"));
		String pcreateTime = request.getParameter("pcreateTime");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date enterdate = null;
		try {
			enterdate = df.parse(pcreateTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String premark = request.getParameter("premark");
		Product product = new Product(pno, hno, pname, pprice, wnumber, premark, new java.sql.Date(enterdate.getTime()));
		ProductDao pDao = new ProductDaoImpl();
		int flag = pDao.addProduct(product);
		if(flag > 0) {
			System.out.println("添加成功");
			response.sendRedirect(request.getContextPath()+"/ProductFindAll");
		}
		else {
			System.out.println("添加失败");
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
