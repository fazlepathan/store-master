package com.yumStore.store.repo;

import com.yumStore.store.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepo extends MongoRepository<Cart, Integer> {
}
