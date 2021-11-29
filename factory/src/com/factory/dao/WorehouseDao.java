package com.factory.dao;

import java.util.List;

import com.factory.bean.Worehouse;
import com.factory.bean.WorehouseTwo;
public interface WorehouseDao {

	public abstract boolean add(Worehouse worehouse);
	public WorehouseTwo findByHno(int hno);
	public Worehouse selectHno(int hno);
	boolean update(Worehouse worehouse);
	boolean delete(int hno);
	List<Worehouse> findAll();
}
