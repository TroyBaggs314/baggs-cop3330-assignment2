package org.ex26Test;

import ex26.App;
import ex26.Card;
import ex26.PaymentCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest
{
    @DisplayName("Test App.calculator()")
    @Test
    void testGet1()
    {
        Card c = new Card();
        c.bal = 5000;
        c.apr = 12;
        c.mPay = 100;
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(c));
    }

}