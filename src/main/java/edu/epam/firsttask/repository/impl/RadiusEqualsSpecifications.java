package edu.epam.firsttask.repository.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.repository.Specification;

public class RadiusEqualsSpecifications implements Specification {

    private double radius;

    public RadiusEqualsSpecifications(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean specify(Circle circle) {
        return radius==circle.getRadius();
    }
}
