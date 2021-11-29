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
 * Servlet implementation class FindMaterical
 */
@WebServlet("/FindMaterical")
public class FindMaterical extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMaterical() {
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
		String m_no=request.getParameter("mno");
		int mno = 0;
		if("".equals(m_no)||m_no==null){
			System.out.println(m_no+" 为空ֵ");
		}
		else {
			mno=Integer.parseInt(m_no);
		}
		
		String m_name= request.getParameter("mname");
		String mname = "";
		if("".equals(m_name) || m_name==null){
			System.out.println(m_name+" 为空ֵ");
		}
		else {
			mname=m_name;
		}
		
		//int mnum = Integer.parseInt(request.getParameter("mnum"));
		String m_num = request.getParameter("mnum");
		int mnum = 0;
		if("".equals(m_num)||m_num==null){
			System.out.println(m_num +" 为空ֵ");
		}
		else {
			mnum=Integer.parseInt(m_num);
		}
		
		String m_price = request.getParameter("mprice");
		int mprice = 0;
		if("".equals(m_price)||m_price==null){
			System.out.println(m_price+" 为空ֵ");
		}
		else {
			mprice=Integer.parseInt(m_price);
		}
		
		String m_remark = request.getParameter("mremark");
		String mremark = "";
		if("".equals(m_remark)||m_remark==null){
			System.out.println(m_remark+" 为空ֵ");
		}
		else {
			mremark=m_remark;
		}
		Material material = new Material(mno, mname, mnum, mprice, mremark);
		System.out.println("FindMaterical中:" + material);
		MaterialDao mDao = new MatericalDaoImpl();
		List<Material> list = mDao.findMaterials(material);
		int price = 0;
		for (int i = 0; i < list.size(); i++) {
			price += list.get(i).getMnum()*list.get(i).getMprice();
		}
//		System.out.println(mno);
		request.setAttribute("price", price);
		request.setAttribute("material", list);
		String method = request.getParameter("method");
		if ("update".equals(method)) {
			request.getRequestDispatcher("/admin/updateMaterial.jsp").forward(request, response);
		}
		if ("null".equals(method) || method == null || "".equals(method)) {
			request.getRequestDispatcher("/admin/allMaterial.jsp").forward(request, response);
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
