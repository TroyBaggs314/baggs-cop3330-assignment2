package ex37;
import java.util.Random;
import java.util.Scanner;



public class App
{
    public static void main(String[] args)
    {

    }

    public static ints inputs()
    {
        ints i = new ints();
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the minimum length? ");
        i.length = sc.nextInt();
        System.out.println("How many special characters? ");
        i.chars = sc.nextInt();
        System.out.println("How many numbers? ");
        i.nums = sc.nextInt();
        return i;
    }

    public static String generator(ints ins)
    {
        String gP = "";
        for(int i = 0, k = 0; i < ins.chars; i++)
        {
            Random r = new Random();
            int j = (r.nextInt(65-33)+33);
            if(j >= 48 && j <= 57 && (0 >= ins.nums))
            {
                j += 10;
            }
            else if (j >= 48 && j <= 57 && 0 < ins.nums)
            {
                ins.nums--;
                i--;
            }
            gP = gP + (char)j;
        }
        if(0 < ins.nums)
        {
            for(int i = 0; i < ins.nums; i++)
            {
                Random r = new Random();
                int j = (r.nextInt(58 - 48) + 48);
                gP = gP + (char)j;
            }
        }
        for(int i = 0, k = 0; i < ins.length - (ins.chars + ins.nums); i++)
        {
            Random r = new Random();
            int j = (r.nextInt(123-65)+65);
            if(j >= 91 && j <= 96)
            {
                j += 10;
            }
            gP = (char)j + gP;
        }
        return gP;
    }
}
