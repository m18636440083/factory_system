package com.factory.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Product;
import com.factory.dao.ProductDao;
import com.factory.util.DBUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
				String sql="INSERT INTO t_product VALUES (?, ?, ?, ?, ?, ?, ?)";
				Connection conn = null;
				PreparedStatement pstmt = null;
				conn = DBUtil.getConnection();
				int flag = 0;
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, product.getPno());
					pstmt.setInt(2, product.getHno());
					pstmt.setString(3, product.getPname());
					pstmt.setInt(4, product.getPprice());
					pstmt.setInt(5, product.getWnumber());
					pstmt.setString(6, product.getPremark());
					pstmt.setDate(7, (Date) product.getPcreateTime()); 
					flag = pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				finally {
					//DBUtil.close(null, pstmt, conn);
				}
				return flag;
	}

	@Override
	public int deleteProduct(int pno) {
		// TODO Auto-generated method stub
				Connection conn = null;
				PreparedStatement pstmt = null;
				conn = DBUtil.getConnection();
				String sql="delete from t_product where pno=?";
				int flag = 0;
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, pno);
					flag = pstmt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					//DBUtil.close(null, pstmt, conn);
				}
				return flag;
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
				Connection conn = null;
				PreparedStatement pstmt = null;
				String sql="update t_product set hno=?,pname=?,pprice=?,wnumber=?,premark=?,pcreatTime=? where pno=?";
				conn = DBUtil.getConnection();
				int flag = 0;
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, product.getHno());
					pstmt.setString(2, product.getPname());
					pstmt.setInt(3, product.getPprice());
					pstmt.setInt(4, product.getWnumber());
					pstmt.setString(5, product.getPremark());
					pstmt.setDate(6, (Date) product.getPcreateTime()); 
					pstmt.setInt(7, product.getPno());
					flag = pstmt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//DBUtil.close(null, pstmt, conn);
				}
				return flag;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
				List<Product> list = new ArrayList<Product>();
				String sql="select * from t_product";
				Connection conn=null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				conn = DBUtil.getConnection();
				try {
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while(rs.next()) {
						int pno = rs.getInt("pno");
						int hno = rs.getInt("hno");
						String pname = rs.getString("pname");
						int pprice = rs.getInt("pprice");
						int wnumber = rs.getInt("wnumber");
						Date pcreateTime = rs.getDate("pcreatTime");
						String premark = rs.getString("premark");
						Product product = new Product(pno, hno, pname, pprice, wnumber, premark, pcreateTime);
						list.add(product);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					//DBUtil.close(rs, pstmt, conn);
				}
				return list;
	}

	@Override
	public List<Product> findProducts(String pname) {
		// TODO Auto-generated method stub
		List<Product> pList = new ArrayList<Product>();
		Product product = null;
		String sql = "select * from t_product where pname like ?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			System.out.println(pname);
			pstmt.setString(1, "%" + pname + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt("pno");
				int hno = rs.getInt("hno");
				String pname2 = rs.getString("pname");
				int pprice = rs.getInt("pprice");
				int wnumber = rs.getInt("wnumber");
				Date pcreateTime = rs.getDate("pcreatTime");
				String premark = rs.getString("premark");
				product = new Product(pno, hno, pname2, pprice, wnumber, premark, pcreateTime);
				pList.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//DBUtil.close(rs, pstmt, conn);
		}
		return pList;
				
	}

	@Override
	public Product findProducts(int pno) {
		// TODO Auto-generated method stub
		Product product = null;
		String sql = "select * from t_product where pno=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int pno1 = rs.getInt("pno");
				int hno = rs.getInt("hno");
				String pname2 = rs.getString("pname");
				int pprice = rs.getInt("pprice");
				int wnumber = rs.getInt("wnumber");
				Date pcreateTime = rs.getDate("pcreatTime");
				String premark = rs.getString("premark");
				product = new Product(pno1, hno, pname2, pprice, wnumber, premark, pcreateTime);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//DBUtil.close(rs, pstmt, conn);
		}
		return product;
	}

}
