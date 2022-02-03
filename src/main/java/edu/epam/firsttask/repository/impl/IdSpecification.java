package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.repository.Specification;

public class IdSpecification implements Specification {

    public IdSpecification(int id) {
        this.id = id;
    }

    private int id;

    @Override
    public boolean specify(Circle circle) {
        return id == circle.getId();
    }

    /*@Override
    public boolean checkRadius(Shape shape) {
        return shape.getCircle().getRadius()>10.0;
    }*/
}
