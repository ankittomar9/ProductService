package com.company.productservice.controllers;

import com.company.productservice.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//localhost:8081/products
@RequestMapping("/products")
public class ProductController {

    //localhost:8081/products/1
    @GetMapping("/{productId}")
    public Product getSingleProduct(@PathVariable  ( "productId") Long productId){
        return null;
    }
    //localhost:8081/products
    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
    //localhost:8081/products/create
    @PostMapping()
    public Product createProduct(@RequestBody Product product){
        return product;
    }

    //localhost:8081/products/update
    @PutMapping()
    public Product updateProduct(@RequestBody Product product){
        return product;
    }

    //localhost:8081/products/delete
    @DeleteMapping({"/{id}"})
    public void deleteProduct(@PathVariable ("id")@RequestBody Product product){

    }

}
