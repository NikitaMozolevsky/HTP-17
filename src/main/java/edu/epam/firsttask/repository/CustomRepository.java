package edu.epam.firsttask.repository;

import edu.epam.firsttask.entity.Shape;
import java.util.ArrayList;
import java.util.List;

public class CustomRepository {
    private List<Shape> shapes;

    public CustomRepository(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public CustomRepository() {
    }

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

    public void set(int index, Shape shape) {
        shapes.add(index, shape);
    }

    public List<Shape> query(Specification specification) {
        List<Shape> shapeList = new ArrayList<>();
        for (Shape shape:
             shapes) {
            if (specification.specify(shape)) {
                shapeList.add(shape);
            }
        }
        return shapeList;
    }
}
