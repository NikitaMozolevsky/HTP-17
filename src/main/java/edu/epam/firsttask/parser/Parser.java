package edu.epam.firsttask.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String REGEX_DELIMITER = "\\s+";

    public static List<Double> parse(String str) {

        String[] strings = str.split(REGEX_DELIMITER);
        List<Double> doubles = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            doubles.add(Double.parseDouble(strings[i]));
        }
        return doubles;
    }
}
