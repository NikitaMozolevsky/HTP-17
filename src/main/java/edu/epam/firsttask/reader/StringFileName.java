package edu.epam.firsttask.reader;

import edu.epam.firsttask.exception.CustomException;

import java.io.IOException;

public interface StringFileName {
    String reader(String fileName) throws CustomException, IOException;
}
