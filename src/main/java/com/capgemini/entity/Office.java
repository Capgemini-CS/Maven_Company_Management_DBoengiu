package com.capgemini.entity;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Office {

    @Getter @Setter
    private String officeCode;

    @Getter @Setter
    private String city;

    @Getter @Setter
    private String phone;

    @Getter @Setter
    private String addressLine1;

    @Getter @Setter
    private String country;

    @Getter @Setter
    private String postalCode;

    @Getter @Setter
    private String territory;
}
