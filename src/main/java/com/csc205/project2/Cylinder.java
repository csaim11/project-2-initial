package com.csc205.project2;

public class Cylinder extends Shape {

    private double radius;
    private double height;


    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder {radius=" + radius + ", height=" + height + ", surface area=" + surfaceArea() + ", volume=" + volume() + "}";
    }
}
