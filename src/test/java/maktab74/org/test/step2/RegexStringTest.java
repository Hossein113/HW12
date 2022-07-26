package maktab74.org.test.step2;


import maktab74.org.step2.RegexString;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexStringTest {
    @Test
    void outStringTest() {
        List<String> list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("235");


        assertEquals(list, RegexString.chekOutString("a123tr3 456yt56 6uj235"));
    }


}
