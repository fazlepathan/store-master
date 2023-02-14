package com.yumStore.store.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "product")
public class Products {
    @Id
    private int productId;
    private String productName;
    private String productImgUrl;
    private double productPrice;
    private int productAvailable;
}
