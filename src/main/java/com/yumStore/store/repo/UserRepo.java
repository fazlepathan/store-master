package com.yumStore.store.repo;

import com.yumStore.store.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
}
