package com.yumStore.store.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@Document(collection ="Users")
public class User {
    @Id
    private String userName;
    private String password;
    private String userEmail;
    private String userAddress;
    private String userFirstName;
    private String userLastName;
    private String userContactNumber;
}
