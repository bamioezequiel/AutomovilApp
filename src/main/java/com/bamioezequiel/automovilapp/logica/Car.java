package com.bamioezequiel.automovilapp.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String model;
    private String brand;
    private String color;
    private String engiene;
    private String pantent;
    private int doors;

    public Car() {
    }
    

    public Car(int id, String model, String brand, String color, String engiene, String pantent, int doors) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.engiene = engiene;
        this.pantent = pantent;
        this.doors = doors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngiene() {
        return engiene;
    }

    public void setEngiene(String engiene) {
        this.engiene = engiene;
    }

    public String getPantent() {
        return pantent;
    }

    public void setPantent(String pantent) {
        this.pantent = pantent;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    
}
