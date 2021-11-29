package com.factory.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Material;
import com.factory.dao.MaterialDao;
import com.factory.dao.impl.MatericalDaoImpl;

/**
 * Servlet implementation class MatericalFindAll
 */
@WebServlet("/MatericalFindAll")
public class MatericalFindAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatericalFindAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MaterialDao mDao = new MatericalDaoImpl();
		List<Material> list = mDao.findAll();
		int price = 0;
		for (int i = 0; i < list.size(); i++) {
			price += list.get(i).getMnum()*list.get(i).getMprice();
		}
		request.setAttribute("price", price);
		request.setAttribute("material", list);
		request.getRequestDispatcher("/admin/allMaterial.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
