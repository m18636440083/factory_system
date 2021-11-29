package com.factory.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.factory.bean.Manager;
import com.factory.dao.ManagerDao;
import com.factory.util.DBUtil;

public class ManagerDaoImpl implements ManagerDao {

	@Override
	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		String sql = "select * from t_manager";
		List<Manager> list = new ArrayList<Manager>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_id = rs.getInt("id");
				String get_mname = rs.getString("mname");
				String get_username = rs.getString("username");
				String get_password = rs.getString("password");
				String get_mtel = rs.getString("mtel");
				String get_memail = rs.getString("memail");
				int get_mcategory = rs.getInt("mcategory");
				String get_mremark = rs.getString("mremark");
				Manager manager = new Manager();
				manager.setId(get_id);
				manager.setMname(get_mname);
				manager.setUsername(get_username);
				manager.setPassword(get_password);
				manager.setMtel(get_mtel);
				manager.setMemail(get_memail);
				manager.setMcategory(get_mcategory);
				manager.setMremark(get_mremark);
				list.add(manager);
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
	public boolean add(Manager manager) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "insert into t_manager values(?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, manager.getId());
			ps.setString(2, manager.getMname());
			ps.setString(3, manager.getUsername());
			ps.setString(4, manager.getPassword());
			ps.setString(5, manager.getMtel());
			ps.setString(6, manager.getMemail());
			ps.setInt(7, manager.getMcategory());
			ps.setString(8, manager.getMremark());
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
	public boolean update(Manager manager) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "update t_manager set mname=?, username=?, password=?, mtel=?, memail=?, mcategory=?, mremark=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, manager.getMname());
			ps.setString(2, manager.getUsername());
			ps.setString(3, manager.getPassword());
			ps.setString(4, manager.getMtel());
			ps.setString(5, manager.getMemail());
			ps.setInt(6, manager.getMcategory());
			ps.setString(7, manager.getMremark());
			ps.setInt(8, manager.getId());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.getConnection();
		}
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		conn = DBUtil.getConnection();
		String sql = "delete from t_manager where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
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
	public Manager findById(int id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		conn =DBUtil.getConnection();
		String sql = "select * from t_manager where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				int get_id = rs.getInt("id");
				String get_mname = rs.getString("mname");
				String get_username = rs.getString("username");
				String get_password = rs.getString("password");
				String get_mtel = rs.getString("mtel");
				String get_memail = rs.getString("memail");
				int get_mcategory = rs.getInt("mcategory");
				String get_mremark = rs.getString("mremark");
				Manager manager = new Manager();
				manager.setId(get_id);
				manager.setMname(get_mname);
				manager.setUsername(get_username);
				manager.setPassword(get_password);
				manager.setMtel(get_mtel);
				manager.setMemail(get_memail);
				manager.setMcategory(get_mcategory);
				manager.setMremark(get_mremark);
				return manager;
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
	public Manager login(String username, String password) {
		// TODO Auto-generated method stub
		String sql="select * from t_manager where username=? and password=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		conn=DBUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				int get_id=rs.getInt("id");
				String get_mname = rs.getString("mname");
				String get_username=rs.getString("username");
				String get_password=rs.getString("password");
				String get_mtel=rs.getString("mtel");
				String get_memail=rs.getString("memail");
				int get_mcategory=rs.getInt("mcategory");
				String get_mremark=rs.getString("mremark");
				
				Manager manager=new Manager
						(get_id, get_mname, get_username, get_password, 
								get_mtel, get_memail, get_mcategory, get_mremark);
				return manager;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.close(ps, rs, conn);
		}
		
		
		return null;
	}

}
