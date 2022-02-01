package edu.epam.firsttask.observer;

import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.entity.Shape;
import edu.epam.firsttask.entity.ShapeStatistics;
import edu.epam.firsttask.entity.Warehouse;
import edu.epam.firsttask.solution.Solution;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeObserverImpl implements ShapeObserver {
    private static final Logger log = LogManager.getLogger();
    @Override
    public void changeElement(Shape shape) {
        Solution solution = new Solution();
        Point point = shape.getCircle().getPoint();
        double circleArea = solution.circleArea(shape.getCircle());
        double circlePerimeter = solution.circlePerimeter(shape.getCircle());
        String intersectionOfCoordinateAxes = solution.intersectionOfCoordinateAxes
                (shape.getCircle(), point);
        ShapeStatistics shapeStatistics = new ShapeStatistics
                (circleArea, circlePerimeter, intersectionOfCoordinateAxes);
        int shapeId = shape.getId();
        Warehouse warehouse = Warehouse.getWarehouse();
        try {
            warehouse.replace(shapeId, shapeStatistics);
        } catch (Exception e) {
            log.log(Level.INFO, "check ID");
        }
    }
}
