package com.yumStore.store.controller;

import com.yumStore.store.model.Cart;
import com.yumStore.store.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200/")
@RestController
public class CartController {
    @Autowired
    private CartRepo cRepo;


    @GetMapping("/cart/product/find/all")
    public List<Cart> getAllCartProduct(){
        return cRepo.findAll();
    }

    @PostMapping("/cart/product/add")
    public String addCartProduct(@RequestBody Cart prc){
        cRepo.save(prc);
        return "Added product to cart with id "+prc.getProductId();
    }

    @PostMapping("/cart/clear")
    public void deleteCartProduct(){
        cRepo.deleteAll();

    }

    @PostMapping("/cart/product/delete")
    public void deleteCartProductById(@RequestBody int id){
        cRepo.deleteById(id);

    }

    @GetMapping("/cart/tota")
    public int totalCart(){
        List<Cart> crt = cRepo.findAll();
        return crt.size();


    }

    @GetMapping("/cart/totalPrice")
    public double totalCartPrice(){
        List<Cart> crt = cRepo.findAll();
        double totalCartPrice = 0;

        for (int i = 0; i<crt.size(); i++){
            totalCartPrice = totalCartPrice +((double) crt.get(i).getProductPrice()*(double) crt.get(i).getProductQuantity());
        }
        return totalCartPrice;
    }

}
