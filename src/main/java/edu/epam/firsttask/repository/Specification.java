package edu.epam.firsttask.repository;

import edu.epam.firsttask.entity.Circle;

public interface Specification {
    boolean specify(Circle circle);
}
