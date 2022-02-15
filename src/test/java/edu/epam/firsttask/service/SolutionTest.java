package edu.epam.firsttask.service;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    CustomSolutionImpl customSolutionImpl = new CustomSolutionImpl();
    Point point = new Point(10.0, 4.0);
    Circle circle = new Circle(point, 10.0);
    String result = "X and Y axes intersect";

    @Test
    public void circleAreaTest() {
        double actual = customSolutionImpl.circleArea(circle);
        double expected = 314.1592653589793;
        assertEquals(expected, actual);
    }

    @Test
    public void circlePerimeterTest() {
        double actual = customSolutionImpl.circlePerimeter(circle);
        double expected = 62.83185307179586;
        assertEquals(expected, actual);
    }

    @Test
    public void intersectionOfCoordinateAxesTest() {
        String actual = customSolutionImpl.intersectionOfCoordinateAxes(circle);
        String expected = result;
        assertEquals(actual, expected);
    }
}