package edu.epam.firsttask.validator;

import edu.epam.firsttask.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Checker {

    private static final Logger log = LogManager.getLogger();
    private static final String REGEX_DELIMITER = "\\s+";
    private static final int necessaryArrayVolume = 3;

    public static String validator (ArrayList<String> stringArray) {
        ArrayList<Double> arrayList = new ArrayList<>();
        String[] strings;
        String correct = null;
        for (String str : stringArray)
        { if (((strings = str.split(REGEX_DELIMITER)).length)==necessaryArrayVolume) {
                try { for (String string : strings) {
                        arrayList.add(Double.parseDouble(string));
                    } if (arrayList.get(0)<=0) {
                        arrayList = new ArrayList<>();// если радиус круга arrayList.get(0) меньше либо равен нулю
                        log.log(Level.ERROR, "radius cannot be less than or equal to zero");
                    } else {
                    correct = str;
                }
                } catch (Exception e)
                /*catch (CustomException e)*/ { // TODO: 24.01.2022 ?
                    arrayList = new ArrayList<>();
                    log.log(Level.ERROR, "number format exception");
                }
            } else {
                arrayList = new ArrayList<>();
                log.log(Level.ERROR, "wrong amount of data per line");
            }
        }
        return correct;
    }
}

