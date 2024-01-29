package org.example.demo_soap.models;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlElement(name = "coder") // Defined this in xml is coder
    private Integer code;
    private String name;
    private Double price;
    private Date dateCreate;
    @XmlTransient // Hide this in xml
    private String maker;
}
