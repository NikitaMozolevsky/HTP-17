package edu.epam.firsttask.entity.comparator;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Shape;

import java.util.Comparator;

public class CompareShapeId implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return o1.getId() - o2.getId();
    }
}
