package edu.epam.firsttask.factory.impl;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.CircleStatistics;
import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.entity.Warehouse;
import edu.epam.firsttask.factory.CircleFactory;
import edu.epam.firsttask.observer.impl.ShapeObserverImpl;
import edu.epam.firsttask.repository.CustomRepository;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircleFactoryImpl implements CircleFactory {
    private static final Logger log = LogManager.getLogger();

    private CircleFactoryImpl() {}

    @Override
    public Circle createCircle(Point point, double radius) {
        Circle circle = new Circle(point, radius);
        addObserver(circle);
        addToWarehouse(circle);
        addToRepository(circle);
        return circle;
    }

    public void addToWarehouse(Circle circle) {
        CustomSolutionImpl solution = new CustomSolutionImpl();
        double circleArea = solution.circleArea(circle);
        double circlePerimeter = solution.circlePerimeter(circle);
        String intersectionOfCoordinateAxes = solution.intersectionOfCoordinateAxes(circle);
        Warehouse warehouse = Warehouse.getInstance();
        CircleStatistics circleStatistics = new CircleStatistics(circleArea, circlePerimeter, intersectionOfCoordinateAxes);
        warehouse.put(circle.getId(), circleStatistics);
        log.log(Level.INFO, "circle was put to warehouse");
    }

    public void addObserver(Circle circle) {
        ShapeObserverImpl shapeObserver = new ShapeObserverImpl();
        circle.attach(shapeObserver);
        log.log(Level.INFO, "observer attached");
    }

    public void addToRepository(Circle circle) {
        CustomRepository customRepository = new CustomRepository();
        customRepository.addShape(circle);
        log.log(Level.INFO, "circle was put to repository");
    }
}
