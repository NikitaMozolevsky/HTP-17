package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.repository.Specification;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;

public class CircleAreaEqualsSpecifications implements Specification {

    private double circleArea;
    CustomSolutionImpl customSolution = new CustomSolutionImpl();

    public CircleAreaEqualsSpecifications(double circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public boolean specify(Circle circle) {
        return circleArea==customSolution.circleArea(circle);
    }
}
