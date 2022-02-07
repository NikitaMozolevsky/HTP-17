package edu.epam.firsttask.observer;

import edu.epam.firsttask.entity.Circle;
import jdk.jfr.Event;

import java.util.EventObject;

public class ShapeEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ShapeEvent(Object source) {
        super(source);
    }


    @Override
    public Circle getSource() {
        return (Circle) super.getSource();
    }
}
