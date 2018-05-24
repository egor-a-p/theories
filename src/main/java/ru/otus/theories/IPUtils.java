package ru.otus.theories;

import java.util.regex.Pattern;

public class IPUtils {
    private static final Pattern IP_ADDRESS_PATTERN = Pattern.compile(
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    public static boolean isValidIP(String ip) {
        return IP_ADDRESS_PATTERN.matcher(ip).matches();
    }

    private IPUtils() {
    }
}
