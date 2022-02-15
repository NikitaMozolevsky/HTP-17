package edu.epam.firsttask.parser.impl;

import edu.epam.firsttask.parser.StringParser;
import edu.epam.firsttask.validator.impl.NumberValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringParserImpl implements StringParser {

    private static final Logger log = LogManager.getLogger();
    private static final String REGEX_DELIMITER = "\\s+";

    public List<Double> parserToList(String string) {
        List<Double> checkedList = new ArrayList<>();;
        String[] strings = string.split(REGEX_DELIMITER);
        for (int i = 0; i < strings.length; i++) {
            checkedList.add(Double.parseDouble(strings[i]));
        }
        return checkedList;
    }
}

