package edu.epam.firsttask.observer;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Shape;

public interface ShapeObserver {
    void changeElement(Circle circle);
}
