/*
 * Enterprise Java Development - Final Test
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796
 */

package com.java.GreetingsWebApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilabarbosa
 */

@Entity
@Table(name="greetings")
public class Greeting {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String message;

    public Greeting() {
    }

    public Greeting(Integer id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" + "id=" + id + ", name=" + name + ", message=" + message + '}';
    }
    
    
}
