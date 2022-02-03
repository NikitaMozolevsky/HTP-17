package edu.epam.firsttask.observer;

import edu.epam.firsttask.entity.*;
import edu.epam.firsttask.solution.Solution;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeObserverImpl implements ShapeObserver {
    private static final Logger log = LogManager.getLogger();
    public void changeElement(Circle circle) {
        Solution solution = new Solution();
        Point point = circle.getPoint();
        double circleArea = solution.circleArea(circle);
        double circlePerimeter = solution.circlePerimeter(circle);
        String intersectionOfCoordinateAxes = solution.intersectionOfCoordinateAxes
                (circle, point);
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
