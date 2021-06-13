package org.ex29Test;

import ex29.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @DisplayName("Test App.math()")
    @Test
    void testGet1()
    {
        int[] i = new int[]{1,2,3,4,5};
        assertEquals(18, App.math(4));
    }

}