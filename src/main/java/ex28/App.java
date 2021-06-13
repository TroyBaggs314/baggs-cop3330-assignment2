package ex28;
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        int i[] = repeatedInputs();
        int count = math(i);
        result(count);
    }

    public static void result(int count)
    {
        System.out.println("The total is " + count + ".");
    }

    public static int math(int i[])
    {
        int count = 0;
        for(int j = 0; j < i.length; j++)
        {
            count += i[j];
        }
        return count;
    }

    public static int[] repeatedInputs()
    {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[5];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            count[i] = sc.nextInt();
            System.out.println(count[i]);
        }
        return count;
    }
}
