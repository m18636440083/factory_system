package com.factory.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.bean.Manager;
import com.factory.dao.ManagerDao;
import com.factory.dao.impl.ManagerDaoImpl;

/**
 * Servlet implementation class ManagerServletList
 */
@WebServlet("/ManagerServletList")
public class ManagerServletList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerServletList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ManagerDao dao=new ManagerDaoImpl();
		List<Manager> list=dao.findAll();
		//System.out.println("hello servlet"+list);
		//M ���� ��  v( jsp)
		//�ӿ�����ת�Ե���ͼ��ʱ����Ҫ����ģ�Ͳ������
		request.setAttribute("ms", list);
		//C ����  V  ---ת��
		request.getRequestDispatcher("/admin/Manager_list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
