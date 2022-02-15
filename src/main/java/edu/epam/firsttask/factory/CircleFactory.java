package edu.epam.firsttask.factory;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;

import java.util.List;

public interface CircleFactory {
    public Circle createCircle(Point point, double radius);
}
