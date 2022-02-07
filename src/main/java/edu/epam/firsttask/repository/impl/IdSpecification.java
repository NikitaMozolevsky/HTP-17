package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.repository.Specification;

public class IdSpecification implements Specification {

    private int id;

    public IdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(Circle circle) {
        return id == circle.getId();
    }
}
