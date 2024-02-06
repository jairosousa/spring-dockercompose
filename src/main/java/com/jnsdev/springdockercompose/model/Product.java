package com.jnsdev.springdockercompose.model;

import jakarta.persistence.*;
import lombok.*;

/**
 * @Autor Jairo Nascimento
 * @Created 06/02/2024 - 13:02
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private int quantity;
}
