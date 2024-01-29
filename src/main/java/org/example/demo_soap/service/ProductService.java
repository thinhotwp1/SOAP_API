package org.example.demo_soap.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.demo_soap.models.Product;

import java.util.Date;
import java.util.List;
@WebService(name = "ProductWS")
public class ProductService {
    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "Price") Double price){
        return price*1.5;
    }

    @WebMethod(operationName = "getProduct")
    public Product getProduct(Integer code){
        return new Product(code,"Iphone 15 promax",15000000.0, new Date(),"Admin");
    }

    @WebMethod(operationName = "getListProduct")
    public List<Product> getListProduct(){
        return List.of(new Product(100,"Iphone 15",12000000.0, new Date(),"Admin"),
                new Product(101,"Iphone 12",11000000.0, new Date(),"Admin"),
                new Product(102,"Iphone 11",9000000.0, new Date(),"Admin"));
    }
}
