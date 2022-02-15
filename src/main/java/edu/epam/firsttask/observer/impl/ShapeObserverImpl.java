package edu.epam.firsttask.observer.impl;

import edu.epam.firsttask.entity.*;
import edu.epam.firsttask.observer.ShapeEvent;
import edu.epam.firsttask.observer.ShapeObserver;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeObserverImpl implements ShapeObserver {
    private static final Logger log = LogManager.getLogger();
    public void changeElement(ShapeEvent shapeEvent) {
        Circle circle = shapeEvent.getSource();
        CustomSolutionImpl customSolutionImpl = new CustomSolutionImpl();
        Point point = circle.getPoint();
        double circleArea = customSolutionImpl.circleArea(circle);
        double circlePerimeter = customSolutionImpl.circlePerimeter(circle);
        String intersectionOfCoordinateAxes = customSolutionImpl.intersectionOfCoordinateAxes
                (circle);
        CircleStatistics shapeStatistics = new CircleStatistics
                (circleArea, circlePerimeter, intersectionOfCoordinateAxes);
        int shapeId = circle.getId();
        Warehouse warehouse = Warehouse.getInstance();
        try {
            warehouse.replace(shapeId, shapeStatistics);
        } catch (Exception e) {
            log.log(Level.INFO, "check ID");
        }
    }
}
