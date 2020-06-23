package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return (this.a * this.h)/2;
    }
}
