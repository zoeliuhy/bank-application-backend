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
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="iban")
    private String iban;
    @Column(name="balance")
    private int balance;


//    public Account(String name, String email, String iban) {
//        super();
//        this.name = name;
//        this.email = email;
//        this.iban = iban;
//    }
//
//    public Long getId() {
//
//        return id;
//    }
//
//    public String getName() {
//
//        return name;
//    }
//
//    public void setName(String name) {
//
//        this.name = name;
//    }
//    public String getEmail() {
//
//        return email;
//    }
//
//    public void setEmail(String email) {
//
//        this.email = email;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    @Override
//    public String toString() {
//        return "Account{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", iban='" + iban + '\'' +
//                '}';
//    }
}
