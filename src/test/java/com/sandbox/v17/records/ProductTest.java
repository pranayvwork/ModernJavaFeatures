package com.sandbox.v17.records;
import main.java.com.sandbox.v17.records.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {
    @Test
    void createProduct(){
        //given
        var product  = new Product("Macbook Air",
                new BigDecimal("2222.50"),
                "Electronics");
        //when
        System.out.println("product=" + product);
        assertEquals("Macbook Air", product.name());
        assertEquals("Electronics", product.type());
        //then
    }

    @Test
    void createProduct_NameNotValid(){
        var exception = assertThrows(IllegalArgumentException.class,
                ()-> new Product("",
                        new BigDecimal("2222.50"),
                        "ELECTRONICS"));
        assertEquals("Name is not valid", exception.getMessage());
    }

    @Test
    void createProduct_CostNotValid(){
        var exception = assertThrows(IllegalArgumentException.class,
                ()-> new Product("Macbook Air",
                        new BigDecimal("0"),
                        "ELECTRONICS"));
        assertEquals("Cost is not valid", exception.getMessage());
    }
    @Test
    void createProduct_Type(){
        var product  = new Product("Macbook Air",
                new BigDecimal("2222.50")
        );
        System.out.println("product =" + product);
        assertEquals("Macbook Air", product.name());
        assertEquals("GENERAL", product.type());
    }

    @Test
    void createProductComparison(){
        var product1  = new Product("Macbook Air",
                new BigDecimal("2222.50"),
                "GENERAL"
        );
        var product2  = new Product("Macbook Air",
                new BigDecimal("2222.50"),
                "ELECTRONICS"
        );
        // We have purposefully made changes to equals method (of Product.java) omitting the 'Type' comparison.
        // Therefore, even when Type is GENERAL and ELECTRONICS they still are considered equals.
        assertEquals(product1,product2);
    }
}
