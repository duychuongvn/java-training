package vn.smartdev.tdd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import vn.smartdev.tdd.dao.entity.Product;
import vn.smartdev.tdd.dao.repository.ProductRepository;
import vn.smartdev.tdd.service.IProductService;

public class ProductServiceImpl implements IProductService {

    
    private ProductRepository productRepository;
    
    public ProductServiceImpl() {
        
    }
    
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Float getTotalAmountOfProduct(String productId) {
        Product product = productRepository.findById(productId);

        return product.getPrice() * product.getTotal();
    }

}
