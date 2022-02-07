package edu.epam.firsttask.main;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.exception.CustomException;
import edu.epam.firsttask.parser.impl.StringParserImpl;
import edu.epam.firsttask.reader.impl.StringFileNameImpl;
import edu.epam.firsttask.service.impl.CustomSolutionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        StringParserImpl stringParser = new StringParserImpl();
        StringFileNameImpl stringFileName = new StringFileNameImpl();
        List<String> strings = stringFileName.reader();
        List<Double> doubles = stringParser.parserToList(strings);
        double x = doubles.get(1);
        double y = doubles.get(2);
        double radius = doubles.get(0);
        Point point = new Point(x, y);
        Circle circle = new Circle(point, radius);
        CustomSolutionImpl customSolutionImpl = new CustomSolutionImpl();
        customSolutionImpl.circleArea(circle); //вычисление площади круга
        log.log(Level.INFO, "area = {} ;", customSolutionImpl.circleArea(circle));
        customSolutionImpl.circlePerimeter(circle); //вычисление периметра круга
        log.log(Level.INFO, "perimeter = {} ;", customSolutionImpl.circlePerimeter(circle));
        customSolutionImpl.intersectionOfCoordinateAxes(circle, point);
        log.log(Level.INFO, "result = {} ;", customSolutionImpl.intersectionOfCoordinateAxes(circle, point));
    }
}
