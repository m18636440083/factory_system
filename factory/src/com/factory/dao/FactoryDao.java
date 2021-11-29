package com.factory.dao;

import java.util.List;

import com.factory.bean.Factory;

public interface FactoryDao {
	public int addFactory(Factory factory);
	public int deleteFactory(String fname);
	public int updateFactory(Factory factory);
	public List<Factory> findAll();
	public List<Factory> findFactory(String fname);
	public Factory findFactorys(String fname);
}
