package org.ex37Test;

import ex37.App;
import ex37.ints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.generator()")
    @Test
    void testGet1()
    {
        ints i = new ints();
        i.length = 8;
        i.chars = 2;
        i.nums = 2;
        assertEquals("TagYH-5!6", App.generator(i)); // i cant even begin to think how to test this, unless i tested it using itself which is flawed
    }

}