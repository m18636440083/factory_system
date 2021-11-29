package com.factory.dao;

import java.util.List;


import com.factory.bean.Product;

public interface ProductDao {
	public int addProduct(Product product);
	public int deleteProduct(int pno);
	public int updateProduct(Product product);
	public List<Product> findAll();
	public List<Product> findProducts(String pname);
	public Product findProducts(int pno);
}
