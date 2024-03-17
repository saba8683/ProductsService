package com.app.ProductsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductAPI {
    @GetMapping("/getproducts")
    public List<Product> getProduct(){
        System.out.println("Call started here");
        List<Product> products=new ArrayList<>();
        products.add(new Product(101,"Dove",16.5));
        products.add(new Product(102,"ParleG",5.5));
        products.add(new Product(103,"Lux",10));
        products.add(new Product(104,"Detol",25.25));
        System.out.println("Call ends here");
        return products;
    }
}
