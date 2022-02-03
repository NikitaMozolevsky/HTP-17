package edu.epam.firsttask.reader;

import edu.epam.firsttask.exception.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StringFileName {

    private static final Logger log = LogManager.getLogger();
    private static final String FILE_NAME = "data/sent.txt";

    public static ArrayList<String> reader() {
        String s;

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(FILE_NAME);
        } catch (FileNotFoundException e) {
            log.log(Level.ERROR, "file not found");
        }
        assert fileReader != null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> strings = new ArrayList<>();
            while(true) {
                try {
                    if ((s = bufferedReader.readLine())!=null) {
                        strings.add(s);
                    }
                    else {
                        return strings;
                    }
                } catch (IOException e) {
                    log.log(Level.ERROR, "IOException");
                }
            }
    }
}
