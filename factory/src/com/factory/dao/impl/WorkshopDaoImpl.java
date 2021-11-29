/*
 * 中北大学软件学院版权所有
 */
package com.factory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Workshop;
import com.factory.bean.WorkshopTwo;
import com.factory.dao.WorkshopDao;
import com.factory.util.DBUtil;

/**
 * 
 * @author 张佳豪
 * @version 1.0
 */
public class WorkshopDaoImpl implements WorkshopDao {

	@Override
	public boolean add(Workshop workshop) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "insert into t_workshop values(?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, workshop.getWno());
			ps.setString(2, workshop.getFname());
			ps.setString(3, workshop.getWmanager());
			ps.setString(4, workshop.getWlocation());
			ps.setString(5, workshop.getWtel());
			ps.setString(6, workshop.getWremark());
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
	public WorkshopTwo findByWno(int id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "SELECT\r\n" + 
				"t_workshop.wno,\r\n" + 
				"t_workshop.fname,\r\n" + 
				"t_workshop.wmanager,\r\n" + 
				"t_workshop.wlocation,\r\n" + 
				"t_workshop.wtel,\r\n" + 
				"production_workshop.pno,\r\n" + 
				"t_product.pname,\r\n" + 
				"t_product.pprice,\r\n" + 
				"t_product.pcreatTime\r\n" + 
				"FROM\r\n" + 
				"t_workshop\r\n" + 
				"INNER JOIN production_workshop ON production_workshop.wno = t_workshop.wno\r\n" + 
				"INNER JOIN t_product ON production_workshop.pno = t_product.pno\r\n" + 
				"where t_workshop.wno = ?";
		WorkshopTwo workshopTwo = new WorkshopTwo();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_wno = rs.getInt("wno");
				String get_fname = rs.getString("fname");
				String get_wmanagerName = rs.getString("wmanager");
				String get_wtel = rs.getString("wtel");
				String get_wlocation = rs.getString("wlocation");
				int get_pno = rs.getInt("pno");
				String get_pname = rs.getString("pname");
				int get_pprice = rs.getInt("pprice");
				String get_time = rs.getString("pcreatTime");
				
				workshopTwo.setWno(get_wno);
				workshopTwo.setFname(get_fname);
				workshopTwo.setWmanager(get_wmanagerName);
				workshopTwo.setWlocation(get_wlocation);
				workshopTwo.setWtel(get_wtel);
				workshopTwo.setPno(get_pno);
				workshopTwo.setPname(get_pname);
				workshopTwo.setPprice(get_pprice);
				workshopTwo.setPcreatTime(get_time);
				return workshopTwo;
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
	public Workshop selectWno(int wno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "select * from t_workshop where wno=?";
		Workshop workshop = new Workshop();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, wno);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_wno = rs.getInt("wno");
				String get_fname = rs.getString("fname");
				String get_wmanagerName = rs.getString("wmanager");
				String get_wtel = rs.getString("wtel");
				String get_wlocation = rs.getString("wlocation");
				String get_remark = rs.getString("wremark");
				workshop.setWno(get_wno);
				workshop.setFname(get_fname);
				workshop.setWmanager(get_wmanagerName);
				workshop.setWtel(get_wtel);
				workshop.setWlocation(get_wlocation);
				workshop.setWremark(get_remark);
				System.out.println("true");
				return workshop;
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
	public boolean update(Workshop workshop) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "update t_workshop set wmanager= ?, wlocation = ?,wtel = ?, wremark = ? where wno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, workshop.getWmanager());
			ps.setString(2, workshop.getWlocation());
			ps.setString(3, workshop.getWtel());
			ps.setString(4, workshop.getWremark());
			ps.setInt(5, workshop.getWno());
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
	public boolean delete(int wno) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "delete from t_workshop where wno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, wno);
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
	public List<Workshop> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "select * from t_workshop";
		List<Workshop> list = new ArrayList<Workshop>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_wno = rs.getInt("wno");
				String get_fname = rs.getString("fname");
				String get_wmanagerName = rs.getString("wmanager");
				String get_wtel = rs.getString("wtel");
				String get_wlocation = rs.getString("wlocation");
				String get_remark = rs.getString("wremark");
				Workshop workshop = new Workshop();
				workshop.setWno(get_wno);
				workshop.setFname(get_fname);
				workshop.setWmanager(get_wmanagerName);
				workshop.setWtel(get_wtel);
				workshop.setWlocation(get_wlocation);
				workshop.setWremark(get_remark);
				list.add(workshop);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(ps, rs, conn);
		}
		return list;
	}

}
