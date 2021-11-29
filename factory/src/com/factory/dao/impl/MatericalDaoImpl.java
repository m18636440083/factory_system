package com.factory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Material;
import com.factory.dao.MaterialDao;
import com.factory.util.DBUtil;

public class MatericalDaoImpl implements MaterialDao{

	@Override
	public int addMaterial(Material material) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO t_material VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, material.getMno());
			pstmt.setString(2, material.getMname());
			pstmt.setInt(3, material.getMnum());
			pstmt.setInt(4, material.getMprice());
			pstmt.setString(5, material.getMremark());
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
	public int deleteMaterial(int mno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		String sql="delete from t_material where mno=?";
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mno);
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
	public int updateMaterial(Material material) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="update t_material set mname=?,mnum=?,mprice=?,mremark=? where mno=?";
		conn = DBUtil.getConnection();
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, material.getMname());
			pstmt.setInt(2, material.getMnum());
			pstmt.setInt(3, material.getMprice());
			pstmt.setString(4, material.getMremark());
			pstmt.setInt(5, material.getMno());
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
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		List<Material> list = new ArrayList<Material>();
		String sql="select * from t_material";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int mno = rs.getInt("mno");
				String mname = rs.getString("mname");
				int mnum = rs.getInt("mnum");
				int mprice = rs.getInt("mprice");
				String mremark = rs.getString("mremark");
				Material material = new Material(mno, mname, mnum, mprice, mremark);
				list.add(material);
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
	public List<Material> findMaterials(Material material) {
		// TODO Auto-generated method stub
		List<Material> list = new ArrayList<Material>();
		if (material.getMno()==0 && material.getMnum()==0 && material.getMprice()==0 && material.getMname()==null && material.getMremark()==null) {
			return list;
		}else {
			String sql="select * from t_material where 1=1";
			if ((material.getMno()!=0)) {
				sql += " and mno=" + material.getMno();
			}
			if (material.getMname()!=null && !("null".equals(material.getMname())) && !("".equals(material.getMname()))) {
				sql += " and mname='" + material.getMname() + "'";
			}
//			if (material.getMnum() != 0) {
//				sql += " and mnum=" + material.getMnum();
//			}
			if (material.getMprice() != 0) {
				sql += " and mprice=" + material.getMprice();
			}
			if (material.getMremark() != null && !("null".equals(material.getMremark())) && !("".equals(material.getMremark()))) {
				sql += " and mremark='" + material.getMremark() + "'";
			}
			Connection conn=null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			conn = DBUtil.getConnection();
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					int mno = rs.getInt("mno");
					String mname = rs.getString("mname");
					int mnum = rs.getInt("mnum");
					int mprice = rs.getInt("mprice");
					String mremark = rs.getString("mremark");
					Material materials = new Material(mno, mname, mnum, mprice, mremark);
					list.add(materials);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//DBUtil.close(rs, pstmt, conn);
			}
			return list;
		}
	}

}
