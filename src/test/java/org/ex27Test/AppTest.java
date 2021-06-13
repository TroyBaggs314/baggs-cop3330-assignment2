package org.ex27Test;

import ex27.App;
import ex27.employeeCredentials;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @DisplayName("Test App.passwordValidator() 12345")
    @Test
    void testGet1()
    {
        employeeCredentials ec = new employeeCredentials();
        ec.fName = "John";
        ec.lName = "Johnson";
        ec.zipCode = "55555";
        ec.id = "TK-4321";
        assertEquals(0, App.validateFirstName(ec));
        assertEquals(0, App.validateLastName(ec));
        assertEquals(true, App.validateID(ec));
        assertEquals(true, App.validateZipCode(ec));
        ec.fName = "J";
        ec.lName = "";
        ec.zipCode = "ABCDE";
        ec.id = "A12-1234";
        assertEquals(1, App.validateFirstName(ec));
        assertEquals(2, App.validateLastName(ec));
        assertEquals(false, App.validateID(ec));
        assertEquals(false, App.validateZipCode(ec));
    }

}