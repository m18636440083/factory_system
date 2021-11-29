package com.factory.servlet;

import java.io.IOException;
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
 * Servlet implementation class MatericalFindAll
 */
@WebServlet("/ProductFindAll")
public class ProductFindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductFindAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductDao pDao = new ProductDaoImpl();
		List<Product> list = pDao.findAll();
		int price = 0;
		for (int i = 0; i < list.size(); i++) {
			price += list.get(i).getPprice();
		}
		request.setAttribute("price", price);
		request.setAttribute("product", list);
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
