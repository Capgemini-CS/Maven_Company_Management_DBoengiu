package com.capgemini.service;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    @Getter @Setter
    private String productCode;

    @Getter @Setter
    private String productName;

    @Getter @Setter
    private String productLine;

    @Getter @Setter
    private String productScale;

    @Getter @Setter
    private String productVendor;

    @Getter @Setter
    private String productDescription;

    @Getter @Setter
    private int quantityInStock;

    @Getter @Setter
    private double buyPrice;

    @Getter @Setter
    private double MSRP;
}
