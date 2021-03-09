package com.hsc.mongo.model;

import lombok.Data;

@Data
public class Product {
    private int productId;
    private String productName;
    private double price;

}
