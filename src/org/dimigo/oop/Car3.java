package org.dimigo.oop;

public class Car3 {
    private String company;
    private String model;
    private String color;
    private int masSpeed;
    private int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMasSpeed() {
        return masSpeed;
    }

    public void setMasSpeed(int masSpeed) {
        this.masSpeed = masSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car3(String company, String model, String color, int masSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.masSpeed = masSpeed;
        this.price = price;
    }

    public Car3(String company, String model, String color, int masSpeed) {
        this(company, model, color, masSpeed, 0);
    }

    public Car3(String company, String model, String color) {
        this(company, model, color, 0);
    }
}
