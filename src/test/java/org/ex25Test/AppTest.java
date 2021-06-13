package org.ex25Test;

import ex25.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{

    @DisplayName("Test App.passwordValidator() 12345")
    @Test
    void testGet1()
    {
        assertEquals(1, App.passwordValidator("12345"));
    }

    @DisplayName("Test App.passwordValidator() abcdef")
    @Test
    void testGet2()
    {
        assertEquals(2, App.passwordValidator("abcdef"));
    }

    @DisplayName("Test App.passwordValidator() abcs")
    @Test
    void testGet3()
    {
        assertEquals(3, App.passwordValidator("abcdefghijklmnopqrstuvwxyz"));
    }

    @DisplayName("Test App.passwordValidator() abc123xyz")
    @Test
    void testGet4()
    {
        assertEquals(4, App.passwordValidator("abc123xyz"));
    }
    @DisplayName("Test App.passwordValidator() 1337h@xor!")
    @Test
    void testGet5()
    {
        assertEquals(5, App.passwordValidator("1337h@xor!"));
    }

}