package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Shape;
import edu.epam.firsttask.repository.Specification;

public class IdSpecification implements Specification {

    public IdSpecification(int id) {
        this.id = id;
    }

    private int id;

    @Override
    public boolean specify(Shape shape) {
        return id == shape.getId();
    }

    @Override
    public boolean checkRadius(Shape shape) {
        return shape.getCircle().getRadius()>10.0;
    }
}
