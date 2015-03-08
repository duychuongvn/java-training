package vn.smartdev.tdd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import vn.smartdev.tdd.dao.repository.ProductRepository;
import vn.smartdev.tdd.service.IProductService;

public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Float getTotalAmountOfProduct(String productId) {
		throw new NotImplementedException();
	}
	
}
