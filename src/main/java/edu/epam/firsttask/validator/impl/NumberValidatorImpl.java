package edu.epam.firsttask.validator.impl;

import edu.epam.firsttask.validator.NumberValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberValidatorImpl implements NumberValidator {

    private static final String REGEXP_STRING_VALIDATOR
            = "^\\s*-?\\d{3}(\\s+(-?\\d{1,3}))*\\s*$";
            /*"^\\s*-?\\d{3}(\\s+(-?\\d{1,3}))*\\s*$"*/ //строка содержит 3 цифровых символа

    @Override
    public boolean validateString(String string) {
        return string != null && string.matches(REGEXP_STRING_VALIDATOR);
    }
}
