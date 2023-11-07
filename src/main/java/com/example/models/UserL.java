package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserL {
    @Id
    @GeneratedValue
    private long id;

    private String nom;

    private String email;

    private String password;

    private int age;

    public UserL() {}

    public UserL(long id, String nom, String email, String password, int age) {
    	this.id = id;
    	this.nom = nom;
    	this.email = email;
    	this.password = password;
    	this.age = age;
    }


}
