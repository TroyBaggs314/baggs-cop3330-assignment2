package ex26;
import java.util.Scanner;
import static ex26.PaymentCalculator.calculateMonthsUntilPaidOff;

public class App
{
    public static void main(String[] args)
    {
        Card c = prompts();
        results(c);
    }

    static void results(Card c)
    {
        System.out.println("It will take you " + calculateMonthsUntilPaidOff(c) + " months to pay off this card.");
    }

    public static Card prompts()
    {
        Card c = new Card();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your balance? ");
        c.bal = sc.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        c.apr = sc.nextDouble();
        System.out.println("What is the monthly payment you can make? ");
        c.mPay = sc.nextDouble();
        return c;
    }
}
