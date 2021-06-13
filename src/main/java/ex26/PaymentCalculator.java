package ex26;

public class PaymentCalculator
{
    public static int calculateMonthsUntilPaidOff(Card c)
    {
        double i = (c.apr/100)/365;
        return (int)Math.ceil(-(1d/30d) * Math.log(1 + (c.bal/c.mPay) * (1 - Math.pow(1 + i,30))) / Math.log(1 + i));
    }
}
