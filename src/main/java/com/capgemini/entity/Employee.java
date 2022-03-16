package com.capgemini.entity;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    @Getter @Setter
    private int employeeNumber;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String extension;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String officeCode;

    @Getter @Setter
    private int reportsTo;

    @Getter @Setter
    private String jobTitle;


}
