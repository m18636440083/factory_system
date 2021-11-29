package com.factory.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Factory;
import com.factory.dao.FactoryDao;
import com.factory.util.DBUtil;

public class FactoryDaoImpl implements FactoryDao {

	@Override
	public int addFactory(Factory factory) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO t_factory VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, factory.getFname());
			pstmt.setString(2, factory.getFleader());
			pstmt.setString(3, factory.getFintroduction());
			pstmt.setDate(4, (Date) factory.getFregistertTime()); 
			pstmt.setString(5, factory.getFlocation());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.close(pstmt, null, conn);
		}
		return flag;
	}

	@Override
	public int deleteFactory(String fname) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = DBUtil.getConnection();
		String sql="delete from t_factory where fname=?";
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fname);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.close(pstmt, null, conn);;
		}
		return flag;
	}

	@Override
	public int updateFactory(Factory factory) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="update t_factory set fname=?,fleader=?,fintroduction=?,fregistertTime=?,flocation=?";
		conn = DBUtil.getConnection();
		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, factory.getFname());
			pstmt.setString(2, factory.getFleader());
			pstmt.setString(3, factory.getFintroduction());
			pstmt.setDate(4, (Date)factory.getFregistertTime()); 
			pstmt.setString(5, factory.getFlocation());
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(pstmt, null, conn);
		}
		return flag;
	}

	@Override
	public List<Factory> findAll() {
		// TODO Auto-generated method stub
		List<Factory> list = new ArrayList<Factory>();
		String sql="select * from t_factory";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String fname  = rs.getString("fname");
				String fleader = rs.getString("fleader");
				String fintroduction = rs.getString("fintroduction");
				Date fregistertTime = rs.getDate("fregistertTime");
				String flocation = rs.getString("flocation");
				Factory factory = new Factory(fname, fleader, fintroduction, fregistertTime, flocation);
				list.add(factory);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(pstmt, rs, conn);
		}
		return list;
	}

	@Override
	public List<Factory> findFactory(String fname) {
		// TODO Auto-generated method stub
		List<Factory> list = new ArrayList<Factory>();
		String sql="select * from t_factory where fname like ?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + fname + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String fname2  = rs.getString("fname");
				String fleader = rs.getString("fleader");
				String fintroduction = rs.getString("fintroduction");
				Date fregistertTime = rs.getDate("fregistertTime");
				String flocation = rs.getString("flocation");
				Factory factory = new Factory(fname2, fleader, fintroduction, fregistertTime, flocation);
				list.add(factory);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(pstmt, rs, conn);
		}
		return list;
	}

	@Override
	public Factory findFactorys(String fname) {
		// TODO Auto-generated method stub
		Factory factory = null;
		String sql = "select * from t_factory where fname=?";
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String fname2  = rs.getString("fname");
				String fleader = rs.getString("fleader");
				String fintroduction = rs.getString("fintroduction");
				Date fregistertTime = rs.getDate("fregistertTime");
				String flocation = rs.getString("flocation");
				factory = new Factory(fname2, fleader, fintroduction, fregistertTime, flocation);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(pstmt, rs, conn);
		}
		return factory;
	}

}
