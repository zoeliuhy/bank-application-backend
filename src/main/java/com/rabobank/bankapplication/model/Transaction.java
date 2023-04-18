package com.rabobank.bankapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(name="date")
    private String date;
    @Column(name="title")
    private String title;
    @Column(name="amount")
    private String amount;
    @Column(name="description")
    private String description;
    @Column(name="accountId")
    private Long accountId;



//    @Data annotation is from project Lombok. It generates the getters and setters for all the fields that we have in the todo class, equals method, and a toString method.
//    @NoArgsConstructor annotation is from project Lombok and it generates an empty constructor for our Todo class.
//    @AllArgsConstructor annotation is from project Lombok and it generates a constructor with all the fields that are available in our Todo class.
//    @Builder annotation is from project Lombok. It makes it possible for us to use the builder pattern with our Todo model.
}
