package org.ex34Test;

import ex34.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest
{
    @DisplayName("Test App.removeEmployee()")
    @Test
    void testGet1()
    {
        String[] names = new String[]{"John Smith","Jackie Jackson","Amanda Cullen","Jeremy Goodwin"};
        assertArrayEquals(names, App.removeEmployee(App.getEmployees(),"Chris Jones"));
    }

}