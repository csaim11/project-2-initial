package com.csc205.project2;

/*

then generate Cuboid() with setters and getters as well as a toString() method to calculate
the surfaceArea and the volume

*/


public class Cuboid extends Shape {

    private double length;
    private double width;
    private double height;

    public Cuboid() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboid [length=" + length + ", width=" + width + ", height=" + height +
                ", surfaceArea=" + surfaceArea() + ", volume=" + volume() + "]";
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
