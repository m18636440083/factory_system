package com.factory.dao;

import java.util.List;

import com.factory.bean.Manager;

public interface ManagerDao {

	List<Manager> findAll();
	boolean add(Manager manager);
	boolean update(Manager manager);
	boolean delete(int id);
	public Manager findById(int id);
	public Manager login(String username, String password);
}
