package com.mattair.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConverterUtils {

    public static String convertDateToBritishDateTimeString(final LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public static String convertBooleanToString(final boolean valueToConvert) {
        return valueToConvert ? "Yes" : "No";
    }
}
