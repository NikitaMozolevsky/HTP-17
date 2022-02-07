package edu.epam.firsttask.entity.comparator;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;

import java.util.Comparator;


public class ComparePointY implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getPoint().getY() - o2.getPoint().getY());
    }
}
