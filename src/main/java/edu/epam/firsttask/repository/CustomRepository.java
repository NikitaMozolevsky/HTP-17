package edu.epam.firsttask.repository;

import edu.epam.firsttask.entity.Circle;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomRepository {
    private List<Circle> circles;

    public CustomRepository(List<Circle> circles) {
        this.circles = circles;
    }

    public CustomRepository() {
    }

    public void addShape(Circle circle) {
        this.circles.add(circle);
    }

    public void removeShape(Circle circle) {
        this.circles.remove(circle);
    }

    public Circle get(int index) {
        return circles.get(index);
    }

    public void set(int index, Circle circle) {
        circles.add(index, circle);
    }

    public List<Circle> query(Specification specification) {
        List<Circle> circleList = new ArrayList<>();
        for (Circle circle:
             circles) {
            if (specification.specify(circle)) {
                 circleList.add(circle);
            }
        }
        return circleList;
    }

    /*public List<Circle> queryStream(Specification specification) {
        List<Circle> circleList = new ArrayList<>();
        Stream stream = circleList.stream();
        stream.filter((x)->specification.specify((Circle) x).
    }*/
}
