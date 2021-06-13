package ex38;
import java.util.Scanner;

public class App
{
    public static void main (String[] args)
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        tell(filterEvenNumbers (input()));
    }

    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int[] filterEvenNumbers (String s)
    {
        int[] totArr = new int[(s.length()+1)/2];
        int[] returnArr = new int[(int)Math.ceil(totArr.length/2)];
        for(int i = 0; i < totArr.length; i++)
        {
            totArr[i] = Character.getNumericValue(s.charAt(((i+1)*2)-2));
        }
        for(int i = 0, k = 1; i < returnArr.length; i++,k+=2)
        {
            returnArr[i] = totArr[k];
        }
        return returnArr;
    }

    public static void tell(int[] arr)
    {
        System.out.print("The even numbers are");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
        System.out.println(".");
    }
}
