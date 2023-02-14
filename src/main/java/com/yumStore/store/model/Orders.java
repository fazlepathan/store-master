package com.yumStore.store.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Orders")
public class Orders {
    @Id
    private int orderId;
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userContactNumber;
    private String userAddress;
    private String city;
    private String country;
    private String zip;
    private String paymentMethod;
    private List<Cart> items;
    private double grossAmount;

}
