package edu.epam.firsttask.entity;

public class CircleStatistics {
    private double circleArea;
    private double circlePerimeter;
    private String intersectionOfCoordinateAxes;

    public CircleStatistics(double circleArea, double circlePerimeter, String intersectionOfCoordinateAxes) {
        this.circleArea = circleArea;
        this.circlePerimeter = circlePerimeter;
        this.intersectionOfCoordinateAxes = intersectionOfCoordinateAxes;
    }

    public double getCircleArea() {
        return circleArea;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }

    public double getCirclePerimeter() {
        return circlePerimeter;
    }

    public void setCirclePerimeter(double circlePerimeter) {
        this.circlePerimeter = circlePerimeter;
    }

    public String getIntersectionOfCoordinateAxes() {
        return intersectionOfCoordinateAxes;
    }

    public void setIntersectionOfCoordinateAxes(String intersectionOfCoordinateAxes) {
        this.intersectionOfCoordinateAxes = intersectionOfCoordinateAxes;
    }
}
