package edu.epam.firsttask.entity;

import edu.epam.firsttask.observer.Observable;
import edu.epam.firsttask.observer.ShapeEvent;
import edu.epam.firsttask.observer.ShapeObserver;
import edu.epam.firsttask.util.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Shape implements Observable {
    private static final Logger log = LogManager.getLogger();

    private int id;
    private List<ShapeObserver> listObservers = new ArrayList<>();

    public Shape() {
        this.id = IdGenerator.generateId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("id=").append(id);
        sb.append(", listObservers=").append(listObservers);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return id == shape.id && Objects.equals(listObservers, shape.listObservers);
    }

    /*public boolean equals(Shape shape) {
        if (this == shape) return true;
        if (shape == null || getClass() != shape.getClass()) return false;
        return id == shape.id;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
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
            shapeObserver.changeElement(new ShapeEvent(this));
        }
    }
}
