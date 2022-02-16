package edu.epam.firsttask.reader.impl;

import edu.epam.firsttask.exception.CustomException;
import edu.epam.firsttask.reader.StringFileName;
import edu.epam.firsttask.validator.impl.NumberValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringFileNameImpl implements StringFileName {

    private static final Logger log = LogManager.getLogger();
    private static final String FILE_NAME = "data/sent.txt";

    public String reader(String fileName) throws CustomException, IOException {
        String string;
        NumberValidatorImpl numberValidator = new NumberValidatorImpl();
        FileReader fileReader;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            try {
                fileReader = new FileReader(FILE_NAME);
            } catch (FileNotFoundException ex) {
                log.log(Level.ERROR, "file not found", ex);
                throw new CustomException();
            }
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((string = bufferedReader.readLine()) != null) {
            if (numberValidator.validateString(string)) {
                return string;
            }
        }
        throw new CustomException();
    }
}
