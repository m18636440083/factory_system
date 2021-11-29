package com.factory.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Worehouse;
import com.factory.bean.WorehouseTwo;
import com.factory.dao.WorehouseDao;
import com.factory.util.DBUtil;

public class WorehouseDaoImpl implements WorehouseDao{

	@Override
	public boolean add(Worehouse worehouse) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "insert into t_worehouse values(?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, worehouse.getHno());
			ps.setInt(2, worehouse.getHmanagerId());
			ps.setString(3, worehouse.getHmanagerName());
			ps.setString(4, worehouse.getHtel());
			ps.setString(5, worehouse.getHlocation());
			ps.setString(6, worehouse.getHremark());
			int i = ps.executeUpdate();
			if (i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, null, conn);
		}
		return false;
	}

	@Override
	public WorehouseTwo findByHno(int hno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "SELECT\r\n" + 
				"t_worehouse.hno,\r\n" + 
				"t_worehouse.hmanagerId,\r\n" + 
				"t_worehouse.hmanagerName,\r\n" + 
				"t_worehouse.htel,\r\n" + 
				"t_worehouse.hlocation,\r\n" + 
				"t_product.pno,\r\n" + 
				"t_product.pname,\r\n" + 
				"t_product.pprice,\r\n" + 
				"t_product.wnumber,\r\n" + 
				"t_product.pcreatTime,\r\n" + 
				"worehouse_material.mno,\r\n" + 
				"t_material.mname,\r\n" + 
				"t_material.mnum,\r\n" + 
				"t_material.mprice\r\n" + 
				"FROM\r\n" + 
				"t_worehouse\r\n" + 
				"INNER JOIN t_product ON t_product.hno = t_worehouse.hno\r\n" + 
				"INNER JOIN worehouse_material ON worehouse_material.hno = t_worehouse.hno\r\n" + 
				"INNER JOIN t_material ON worehouse_material.mno = t_material.mno\r\n" + 
				"WHERE t_worehouse.hno = ?";
		WorehouseTwo worehouseTwo = new WorehouseTwo();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, hno);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_hno = rs.getInt("hno");
				int get_hmanagerId = rs.getInt("hmanagerId");
				String get_hmanagerName = rs.getString("hmanagerName");
				String get_htel = rs.getString("htel");
				String get_hlocation = rs.getString("hlocation");
				int get_pno = rs.getInt("pno");
				String get_pname = rs.getString("pname");
				int get_pprice = rs.getInt("pprice");
				int get_wnumber = rs.getInt("wnumber");
				String get_pcreatTime = rs.getString("pcreatTime");
				int get_mno = rs.getInt("mno");
				String get_mname = rs.getString("mname");
				int get_mnum = rs.getInt("mnum");
				int get_mprice = rs.getInt("mprice");
				worehouseTwo.setHno(get_hno);
				worehouseTwo.setHmanagerId(get_hmanagerId);
				worehouseTwo.setHmanagerName(get_hmanagerName);
				worehouseTwo.setHtel(get_htel);
				worehouseTwo.setHlocation(get_hlocation);
				worehouseTwo.setPno(get_pno);
				worehouseTwo.setPname(get_pname);
				worehouseTwo.setPprice(get_pprice);
				worehouseTwo.setWnumber(get_wnumber);
				worehouseTwo.setPcreatTime(get_pcreatTime);
				worehouseTwo.setMno(get_mno);
				worehouseTwo.setMname(get_mname);
				worehouseTwo.setMnum(get_mnum);
				worehouseTwo.setMprice(get_mprice);
				return worehouseTwo;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, rs, conn);
		}
		
		return null;
	}

	@Override
	public boolean update(Worehouse worehouse) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "update t_worehouse set hmanagerId = ?, hmanagerName = ?, htel = ?, hlocation = ?, hremark = ? where hno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, worehouse.getHmanagerId());
			ps.setString(2, worehouse.getHmanagerName());
			ps.setString(3, worehouse.getHtel());
			ps.setString(4, worehouse.getHlocation());
			ps.setString(5, worehouse.getHremark());
			ps.setInt(6, worehouse.getHno());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, null, conn);
		}
		return false;
	}

	@Override
	public boolean delete(int hno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "delete from t_worehouse where hno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, hno);
			int i = ps.executeUpdate();
			if (i>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, null, conn);
		}
		return false;
	}

	@Override
	public List<Worehouse> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "select * from t_worehouse";
		List<Worehouse> list = new ArrayList<Worehouse>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_hno = rs.getInt("hno");
				int get_hmanagerId = rs.getInt("hmanagerId");
				String get_hmanagerName = rs.getString("hmanagerName");
				String get_htel = rs.getString("htel");
				String get_hlocation = rs.getString("hlocation");
				String get_hremark = rs.getString("hremark");
				Worehouse worehouse = new Worehouse();
				worehouse.setHno(get_hno);
				worehouse.setHmanagerId(get_hmanagerId);
				worehouse.setHmanagerName(get_hmanagerName);
				worehouse.setHtel(get_htel);
				worehouse.setHlocation(get_hlocation);
				worehouse.setHremark(get_hremark);
				list.add(worehouse);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, rs, conn);
		}
		return list;
	}

	@Override
	public Worehouse selectHno(int hno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "select * from t_worehouse where hno=?";
		Worehouse worehouse = new Worehouse();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, hno);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_hno = rs.getInt("hno");
				int get_hmanagerId = rs.getInt("hmanagerId");
				String get_hmanagerName = rs.getString("hmanagerName");
				String get_htel = rs.getString("htel");
				String get_hlocation = rs.getString("hlocation");
				String get_hremark = rs.getString("hremark");
				worehouse.setHno(get_hno);
				worehouse.setHmanagerId(get_hmanagerId);
				worehouse.setHmanagerName(get_hmanagerName);
				worehouse.setHtel(get_htel);
				worehouse.setHlocation(get_hlocation);
				worehouse.setHremark(get_hremark);
				return worehouse;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, rs, conn);
		}
		return null;
	}
	
}
