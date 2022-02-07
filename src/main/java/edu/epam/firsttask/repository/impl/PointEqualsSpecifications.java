package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.repository.Specification;

public class PointEqualsSpecifications implements Specification {

    private Point point;

    public PointEqualsSpecifications(Point point) {
        this.point = point;
    }

    @Override
    public boolean specify(Circle circle) {
        return point==circle.getPoint();
    }
}
