package com.company;

public class Car {

private int id;
    private String brand;
    private String name;
    private int age;
    private int price;

    public Car() {
    }

    public Car(int id,String brand, String name, int age, int price) {
        this.brand = brand;
        this.name = name;
        this.age = age;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
