package com.yumStore.store.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cart")
public class Cart {
    @Id
    private int productId;
    private String productName;
    private String productImgUrl;
    private double productPrice;
    private int productQuantity;
}
