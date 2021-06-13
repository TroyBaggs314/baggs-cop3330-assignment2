package org.ex33Test;

import ex33.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.prediction()")
    @Test
    void testGet1()
    {
        assertEquals("Yes.", App.prediction(0));
        assertEquals("No.", App.prediction(1));
        assertEquals("Maybe.", App.prediction(2));
        assertEquals("Ask again later.", App.prediction(3));
    }

}