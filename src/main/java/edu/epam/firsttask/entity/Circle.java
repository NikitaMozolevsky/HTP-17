package edu.epam.firsttask.entity;

import edu.epam.firsttask.observer.Observable;
import edu.epam.firsttask.observer.ShapeObserver;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape implements Observable {

    private Point point;
    private double radius;
    private List<ShapeObserver> listObservers = new ArrayList<>();
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

    @Override
    public void attach(ShapeObserver observer) {
        listObservers.add(observer);
    }

    @Override
    public void detach(ShapeObserver observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ShapeObserver shapeObserver:
                listObservers) {
            shapeObserver.changeElement(this);
        }
    }
}
