package com.tobeto.spring.b.pair4;

import org.springframework.web.bind.annotation.*;
import com.tobeto.spring.b.pair4.models.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {
    List<Product> inProductsList = new ArrayList<>();

    @GetMapping
    public List<Product> get(){
        return inProductsList;
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable int id){
        Product product = inProductsList.stream().filter((p) -> p.getId() == id).findFirst().orElseThrow();
        return product;
    }

    @PostMapping
    public String add(@RequestBody Product product) {
        inProductsList.add(product);
        return product.getId()+" ID' li ürün sisteme eklendi.";
    }

    @PutMapping
    public String update(@RequestBody Product updatedProduct){
        Product product = inProductsList
                .stream()
                .filter((p) -> p.getId() == updatedProduct.getId())
                .findFirst() // {}
                .orElseThrow();
        product.setName(updatedProduct.getName());
        product.setPrice(updatedProduct.getPrice());
        product.setStock(updatedProduct.getStock());
        return product.getId()+" ID' li ürün güncellendi.";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        Product product = inProductsList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst() // {}
                .orElseThrow();
        inProductsList.remove(product);
        return id+" ID' li ürün silindi.";
    }
}
