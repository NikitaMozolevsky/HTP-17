package edu.epam.firsttask.entity;

public class Circle extends Shape {

    private Point point;
    private double radius;

    public Circle(Circle circle) {
        super(circle);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

}
