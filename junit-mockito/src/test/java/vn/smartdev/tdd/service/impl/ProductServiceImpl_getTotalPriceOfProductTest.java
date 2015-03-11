package vn.smartdev.tdd.service.impl;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import vn.smartdev.tdd.dao.entity.Category;
import vn.smartdev.tdd.dao.entity.Product;
import vn.smartdev.tdd.dao.repository.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImpl_getTotalPriceOfProductTest extends ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductServiceImpl productService;
    
    @Before
    public void initMocks() {
       // productService = new ProductServiceImpl(productRepository);
      //  MockitoAnnotations.initMocks(productService);
    }
    
    @Test
    public void shouldReturn45WhenCatalogIsSammsungAndNumberOfRecordIs10AndPriceIs5() {
        
        Float actualResult = new Float(45);
        Float expectedResult = prepareGetTotalAmountOfProduct("SS02");
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    
    
    private  Float prepareGetTotalAmountOfProduct(String productId) {
        Mockito.when(productRepository.findById("SS02")).thenReturn(new Product("SS02", "Samsung Galaxy S3", 5, new Float(10), Category.Samsung));
        return productService.getTotalAmountOfProduct(productId);
    }
}
