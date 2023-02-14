package com.yumStore.store.repo;

import com.yumStore.store.model.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrdersRepo extends MongoRepository<Orders, Integer> {
}
