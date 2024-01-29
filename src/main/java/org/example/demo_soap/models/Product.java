package org.example.demo_soap.models;
import lombok.Data;

import java.util.Date;
@Data
public class Product {
    private Integer code;
    private String name;
    private Double price;
    private Date dateCreate;

    public Product(Integer code, String name, Double price, Date dateCreate) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.dateCreate = dateCreate;
    }
}
