package org.ex31Test;

import ex31.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @DisplayName("Test App.math()")
    @Test
    void testGet1()
    {
        int[] in = new int[]{65,22};
        int[] out = new int[]{138,145,151,158,165,171,178,185,191};
        assertArrayEquals(out, App.calculate(in));
    }

}