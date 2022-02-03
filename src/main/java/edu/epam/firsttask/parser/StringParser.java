package edu.epam.firsttask.parser;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    private static final Logger log = LogManager.getLogger();
    private static final String REGEX_DELIMITER = "\\s+";
    private static final int NECESSARY_ARRAY_VOLUME = 3;

    public static List<Double> validator (ArrayList<String> stringArray) {
        List<Double> checkedList = new ArrayList<>();
        String[] strings;
        for (String str : stringArray) {
            if (((strings = str.split(REGEX_DELIMITER)).length) == NECESSARY_ARRAY_VOLUME) {
                try {
                    for (String string : strings) {
                        checkedList.add(Double.parseDouble(string));
                    }
                    if (checkedList.get(0) <= 0) {
                        return checkedList;
                    } else {
                        checkedList = new ArrayList<>();// если радиус круга arrayList.get(0) меньше либо равен нулю
                        log.log(Level.ERROR, "radius cannot be less than or equal to zero");
                    }
                } catch (NumberFormatException e) {
                    checkedList = new ArrayList<>();
                    log.log(Level.ERROR, "number format exception");
                }
            } else {
                checkedList = new ArrayList<>();
                log.log(Level.ERROR, "wrong amount of data per line");
            }
        }
        return null;
    }
}

