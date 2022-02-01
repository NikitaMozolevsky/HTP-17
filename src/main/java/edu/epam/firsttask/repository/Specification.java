package edu.epam.firsttask.repository;

import edu.epam.firsttask.entity.Shape;

public interface Specification {
    boolean specify(Shape shape);
    boolean checkRadius(Shape shape);
}
