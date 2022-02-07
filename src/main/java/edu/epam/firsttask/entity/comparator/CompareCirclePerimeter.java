package edu.epam.firsttask.entity.comparator;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;

import java.util.Comparator;

public class CompareCirclePerimeter implements Comparator<Circle> {

    CustomSolutionImpl customSolution = new CustomSolutionImpl();

    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (customSolution.circlePerimeter(o1) - customSolution.circlePerimeter(o2));
    }
}
