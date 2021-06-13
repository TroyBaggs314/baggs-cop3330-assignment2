package org.ex35Test;

import ex35.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.removeEmployee()")
    @Test
    void testGet1()
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Homer");
        names.add("Bart");
        names.add("Maggie");
        names.add("Lisa");
        names.add("Moe");
        assertEquals("Maggie", App.decideWinner(names,2));
    }

}