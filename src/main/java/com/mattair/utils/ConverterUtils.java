package com.mattair.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConverterUtils {

    public static String convertDateToBritishDateTimeString(final LocalDateTime dateTime) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return dateTime.format(formatter);
    }

    public static String convertBooleanToString(final boolean valueToConvert) {
        if (valueToConvert) {
            return "Yes";
        }

        return "No";
    }
}
