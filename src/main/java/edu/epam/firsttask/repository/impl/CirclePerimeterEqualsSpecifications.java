package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.repository.Specification;
import edu.epam.firsttask.service.CustomSolution;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;

public class CirclePerimeterEqualsSpecifications implements Specification {

    private double circlePerimeter;
    CustomSolutionImpl customSolution = new CustomSolutionImpl();

    public CirclePerimeterEqualsSpecifications(double circlePerimeter) {
        this.circlePerimeter = circlePerimeter;
    }

    @Override
    public boolean specify(Circle circle) {
        return circlePerimeter==customSolution.circlePerimeter(circle);
    }
}
