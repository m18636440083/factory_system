/*
 * 中北大学软件学院版权所有
 */
package com.factory.dao;

/**
 * 
 * @author 张佳豪
 * @version 1.0
 */

import java.util.List;

import com.factory.bean.Workshop;
import com.factory.bean.WorkshopTwo;

public interface WorkshopDao {

	public abstract boolean add(Workshop workshop);
	public WorkshopTwo findByWno(int wno);
	public Workshop selectWno(int wno);
	boolean update(Workshop workshop);
	boolean delete(int hno);
	List<Workshop> findAll();
}
