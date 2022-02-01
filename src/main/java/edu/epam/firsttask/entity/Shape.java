package edu.epam.firsttask.entity;

import edu.epam.firsttask.observer.Observable;
import edu.epam.firsttask.observer.ShapeObserver;
import edu.epam.firsttask.repository.CustomRepository;
import edu.epam.firsttask.util.CustomCounter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Shape implements Observable {
    private static final Logger log = LogManager.getLogger();
    private Circle circle;

    private int id;
    private double X;
    private double Y;
    private String Radius;
    private static int arraySize = 3;
    private double[] shapeParameters = new double[arraySize];
    private ShapeStatistics shapeStatistics;
    private CustomRepository customRepository;
    private List<ShapeObserver> listObservers = new ArrayList<>();
    {
        this.id = CustomCounter.generateId();
    }

    public Shape(Circle circle) {
        this.circle = circle;
        this.id = CustomCounter.generateId();
        customRepository = new CustomRepository();
        shapeParameters[0] = circle.getRadius();
        shapeParameters[1] = circle.getPoint().getX();
        shapeParameters[2] = circle.getPoint().getY();
    }

    public Shape() {
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setElement(int index, Double value) {
        if (index>=0||index>arraySize) {
            shapeParameters[index] = value;
            notifyObservers();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
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
