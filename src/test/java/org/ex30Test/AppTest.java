package org.ex30Test;

import ex30.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @DisplayName("Test App.math()")
    @Test
    void testGet1()
    {
        int[][] i = new int[12][12];
        for(int j = 0; j < 12; j++)
        {
            for(int k = 0; k < i.length; k++)
            {
                i[j][k] = (j+1) * (k+1);
            }
        }
        assertEquals(i, App.populateArr(i));
    }

}