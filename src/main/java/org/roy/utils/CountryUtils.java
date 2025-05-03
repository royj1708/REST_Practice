package org.roy.utils;

import java.util.List;

public class CountryUtils {

    public static String extractCapital(Object capital){
        return ((List<String>) capital).get(0);
    }

}
