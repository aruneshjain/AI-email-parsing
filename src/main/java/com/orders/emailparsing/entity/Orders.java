package com.orders.emailparsing.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false, name = "customer_name")
    private String customerName;
    @Column(length = 50, nullable = false, name = "customer_email")
    private String customerEmail;
    @Column(length = 50, nullable = false, name = "product_name")
    private String productName;
    @Column(nullable = false, name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Double price;
}
