package edu.epam.firsttask.entity;

import java.util.Objects;

public class Circle extends Shape {

    private Point point;

    private double radius;


    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        notifyObservers();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
        notifyObservers();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Circle{" + "point=").append(point).append(", radius=").append(radius).append('}');
        return String.valueOf(stringBuilder);
    }

    public boolean equals(Circle circle) {
        if (this == circle) return true;
        if (circle == null || getClass() != circle.getClass()) return false;
        if (!super.equals(circle)) return false;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(point, circle.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), point, radius);
    }
}
