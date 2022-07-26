package maktab74.org.step1;

import java.util.Map;

public class HasmapMethod {
    public static void main(String[] args) {


    }

    public static Integer getSize(Map map) {


        return map.size();

    }


    public static String getValue(Map map, Integer number) {
        Object value = map.get(number);


        return (String) value;

    }


}


