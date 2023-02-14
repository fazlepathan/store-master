package com.yumStore.store.repo;

import com.yumStore.store.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends MongoRepository<Products, Integer> {
      Optional<List<Products>> findByProductName(String name);
}
