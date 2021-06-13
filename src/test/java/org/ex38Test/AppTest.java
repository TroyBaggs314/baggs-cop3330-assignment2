package org.ex38Test;

import ex38.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.filterEvenNumbers()")
    @Test
    void testGet1()
    {
        String s = "1 2 3 4 5 6 7 8";
        int[] i = new int[]{2,4,6,8};
        assertArrayEquals(i, App.filterEvenNumbers(s)); // i cant even begin to think how to test this, unless i tested it using itself which is flawed
    }

}