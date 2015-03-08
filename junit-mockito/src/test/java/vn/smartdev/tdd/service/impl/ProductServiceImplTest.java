package vn.smartdev.tdd.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vn.smartdev.tdd.dao.entity.Category;
import vn.smartdev.tdd.dao.entity.Product;

public class ProductServiceImplTest {

    protected Map<Category, List<Product>> products = new HashMap<Category, List<Product>>();

    protected void prepareData() {
        products.put(Category.Samsung, createSamsungProducts());
        products.put(Category.Apple, createAppleProducts());
        products.put(Category.HTC, createHTCProducts());
    }

    private List<Product> createSamsungProducts() {
        List<Product> samsungProducts = new ArrayList<Product>();
        samsungProducts.add(new Product("SS01", "Samsung Galaxy S2", 10, new Float(100), Category.Samsung));
        samsungProducts.add(new Product("SS02", "Samsung Galaxy S3", 5, new Float(200), Category.Samsung));
        samsungProducts.add(new Product("SS03", "Samsung Galaxy S4", 1, new Float(300), Category.Samsung));
        return samsungProducts;
    }

    private List<Product> createAppleProducts() {
        List<Product> appleProducts = new ArrayList<Product>();
        appleProducts.add(new Product("AP01", "IPhone 5", 100, new Float(400), Category.Apple));
        appleProducts.add(new Product("AP02", "IPhone 6", 50, new Float(500), Category.Apple));
        appleProducts.add(new Product("AP03", "IPhone 6 Plus", 10, new Float(600), Category.Apple));
        return appleProducts;
    }

    private List<Product> createHTCProducts() {
        List<Product> htcProducts = new ArrayList<Product>();
        htcProducts.add(new Product("HTC01", "HTC One M7", 100, new Float(250), Category.HTC));
        htcProducts.add(new Product("HTC02", "HTC One M8", 50, new Float(350), Category.HTC));
        htcProducts.add(new Product("HTC03", "HTC One M9", 10, new Float(450), Category.HTC));
        return htcProducts;
    }
}
