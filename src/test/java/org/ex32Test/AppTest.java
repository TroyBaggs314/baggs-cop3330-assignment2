package org.ex32Test;

import ex32.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.guess()")
    @Test
    void testGet1()
    {
        assertEquals(105, App.guess(105));
    }

}