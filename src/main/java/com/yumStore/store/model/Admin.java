package com.yumStore.store.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="Admins")
public class Admin {
    @Id
    private String userName;
    private String password;
}
