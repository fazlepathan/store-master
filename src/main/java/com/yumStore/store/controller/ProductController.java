package com.yumStore.store.controller;

import com.yumStore.store.model.Products;
import com.yumStore.store.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200/")
@RestController
public class ProductController {

    @Autowired
    private ProductRepo pRepo;

    @GetMapping("/product/find/all")
    public List<Products> getAllProduct(){
        return pRepo.findAll();
    }

    @PostMapping("/product/add")
    public String addProduct(@RequestBody Products pr){
        pRepo.save(pr);
        return "Added product with id "+pr.getProductId();
    }

    @PostMapping("/product/delete")
    public void deleteProduct(@RequestBody int id){
        pRepo.deleteById(id);

    }

    @GetMapping("/product/find/{id}")
    public Optional<Products> getProductById(@PathVariable int id){
        return pRepo.findById(id);
    }

   @GetMapping("/product/find/name/{name}")
   public Optional<List<Products>> getProductByName(@PathVariable String name){
       return pRepo.findByProductName(name);
    }

    @GetMapping("/product/lastProductId")
    public int totalCart(){
        List<Products> pro = pRepo.findAll();

        return (pro.size()+1);


    }
}
