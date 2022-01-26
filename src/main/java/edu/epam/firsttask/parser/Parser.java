package edu.epam.firsttask.parser;

import java.util.List;

public class Parser {

    public static List<Double> split(String s) {

        List<Double> doubles = "\"^\\\\s*-?\\\\d+(\\\\s+(-?\\\\d+))*\\\\s*$\";";
        /*String[] strings = s.split("\\s+");
        Double[] doubles = new Double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;*/
    }
}
