package edu.epam.firsttask.main;

import edu.epam.firsttask.entity.Circle;
import edu.epam.firsttask.entity.Point;
import edu.epam.firsttask.exception.CustomException;
import edu.epam.firsttask.parser.StringParser;
import edu.epam.firsttask.reader.StringFileName;
import edu.epam.firsttask.solution.Solution;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) throws CustomException {
        ArrayList<String> strings = StringFileName.reader();
        List<Double> doubles = StringParser.validator(strings);
        double x = doubles.get(1);
        double y = doubles.get(2);
        double radius = doubles.get(0);
        Point point = new Point(x, y);
        Circle circle = new Circle(point, radius);
        Solution solution = new Solution();
        solution.circleArea(circle); //вычисление площади круга
        log.log(Level.INFO, "area = {} ;", solution.circleArea(circle));
        solution.circlePerimeter(circle); //вычисление периметра круга
        log.log(Level.INFO, "perimeter = {} ;", solution.circlePerimeter(circle));
        solution.intersectionOfCoordinateAxes(circle, point);
        log.log(Level.INFO, "result = {} ;", solution.intersectionOfCoordinateAxes(circle, point));
    }
}
