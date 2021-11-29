package com.factory.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Material;
import com.factory.dao.MaterialDao;
import com.factory.dao.impl.MatericalDaoImpl;

/**
 * Servlet implementation class UpdateMatercial
 */
@WebServlet("/UpdateMaterial")
public class UpdateMaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMaterial() {
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
		int mno = Integer.parseInt(request.getParameter("mno"));
		String mname= request.getParameter("mname");
		int mnum = Integer.parseInt(request.getParameter("mnum"));
		int mprice = Integer.parseInt(request.getParameter("mprice"));
		String mremark = request.getParameter("mremark");
		Material material = new Material(mno, mname, mnum, mprice, mremark);
		MaterialDao mDao = new MatericalDaoImpl();
		int flag = mDao.updateMaterial(material);
		if(flag > 0) {
			System.out.println("修改成功");
			response.sendRedirect(request.getContextPath()+"/MatericalFindAll");
		}
		else {
			System.out.println("修改失败");
			response.sendRedirect(request.getContextPath()+"/error.html");
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
