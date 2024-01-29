package org.example.demo_soap.server;


import jakarta.xml.ws.Endpoint;
import org.example.demo_soap.service.ProductService;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8088/";
        Endpoint.publish(url, new ProductService());
        System.out.println("Server is running on: "+ url);
    }
}
