package com.kodilla.testing.shape;

public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public String getShapeName() {
        return "Circle";
    }
    public double getField() {
        return (this.r*this.r)*3.14;
    }

}
