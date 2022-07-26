package maktab74.org.test.step1;

import maktab74.org.step1.HasmapMethod;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HashMapaTest {

    Map<Integer, String> map = new HashMap<>();

    @Test
    void putTest() {


        map.put(13, "Ali");
        map.put(15, "hosseib");
        // map.put("hosseib",15);

        assertEquals(2, HasmapMethod.getSize(map));

    }

    @Test
    void ValueTest() {
        map.put(1, "Ali");
        map.put(2, "Hassan");
        map.put(3, "Hossein");

        assertEquals("Hossein", HasmapMethod.getValue(map, 3));
    }

    @Test
    void RepetedKeyTest() {
        map.put(1, "Ali");
        map.put(2, "Hassan");
        map.put(1, "Hossein");

        //assertEquals("Ali",HashmapJava.getValue(map,1));
        assertEquals("Hossein", HasmapMethod.getValue(map, 1));
        assertEquals(2, HasmapMethod.getSize(map));
    }

    @Test
    void clearTest() {
        map.put(1, "Ali");
        map.put(2, "Hassan");
        map.put(3, "Hossein");
        map.clear();


        assertEquals(0, HasmapMethod.getSize(map));
    }

    @Test
    void nullTest() {


        map.put(1, "Ali");
        map.put(2, "Hassan");
        map.put(3, "Hossein");
        map.put(null, "Ahmad");
        map.put(5, "Reza");

        assertEquals(5, HasmapMethod.getSize(map));

    }
}

