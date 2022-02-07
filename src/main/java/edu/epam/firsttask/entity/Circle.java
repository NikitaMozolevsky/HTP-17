package edu.epam.firsttask.entity;

import edu.epam.firsttask.observer.Observable;
import edu.epam.firsttask.observer.ShapeObserver;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {

    private Point point;
    private double radius;
    //circleGetID

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
}
