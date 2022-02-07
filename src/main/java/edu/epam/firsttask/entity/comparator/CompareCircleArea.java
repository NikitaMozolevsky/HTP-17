package edu.epam.firsttask.entity.comparator;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;

import java.util.Comparator;

public class CompareCircleArea implements Comparator<Circle> {

    CustomSolutionImpl customSolution = new CustomSolutionImpl();

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (customSolution.circleArea(o1) - customSolution.circleArea(o2));
    }
}
