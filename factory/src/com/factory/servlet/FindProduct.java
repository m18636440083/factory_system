package com.factory.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Product;
import com.factory.dao.ProductDao;
import com.factory.dao.impl.ProductDaoImpl;

/**
 * Servlet implementation class FindMaterical
 */
@WebServlet("/FindProduct")
public class FindProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindProduct() {
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
		String p_name = request.getParameter("pname");
		String pname = null;
		if("".equals(p_name)||p_name==null){
			System.out.println(p_name +" 为空ֵ");
		}
		else {
			pname = p_name;
		}
		ProductDao pDao = new ProductDaoImpl();
		List<Product> pList = new ArrayList<Product>();
		pList = pDao.findProducts(pname);
		int price = 0;
		int num = 0;
		for (int i = 0; i < pList.size(); i++) {
			price += pList.get(i).getPprice();
		}
		request.setAttribute("price", price);
		request.setAttribute("product", pList);
		request.getRequestDispatcher("/admin/allProduct.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
