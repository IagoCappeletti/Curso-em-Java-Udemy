package entities;

import entities_enum.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle(){}

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
