package edu.epam.firsttask.util;

public class IdGenerator {

    private IdGenerator() {
    }

    public static int idCounter = -1;

    public static int generateId() {
        return idCounter;
    }
}
