package edu.epam.firsttask.observer;

public interface Observable {
    void attach(ShapeObserver observer);
    void detach(ShapeObserver observer);
    void notifyObservers();
}
