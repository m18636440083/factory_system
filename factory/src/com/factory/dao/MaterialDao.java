package com.factory.dao;

import java.util.List;


import com.factory.bean.Material;

public interface MaterialDao {
	public int addMaterial(Material material);
	public int deleteMaterial(int mno);
	public int updateMaterial(Material material);
	public List<Material> findAll();
	public List<Material> findMaterials(Material material);
	
}
