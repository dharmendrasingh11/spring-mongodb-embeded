package com.hsc.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "order_service")
public class User {
    private int id;
    private String name;
    private String gender;
    private List<Product> productList;
    private Address address;

}
