package ex31;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        display(calculate(prompts()));
    }

    public static int[] prompts()
    {
        Scanner sc = new Scanner(System.in);
        String nums[] = new String[2];
        int val[] = new int[2];
        System.out.println("Resting Pulse: ");
        nums[0] = sc.next();
        boolean flag;
        do {
            try {
                Integer.parseInt(nums[0]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
                flag = true;
            }
        }while(flag);
        System.out.println("Age: ");
        nums[1] = sc.next();
        do {
            try {
                Integer.parseInt(nums[1]);
                flag = false;
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
                flag = true;
            }
        }while(flag);
        val[0] = Integer.parseInt(nums[0]);
        val[1] = Integer.parseInt(nums[1]);
        return val;
    }

    public static int[] calculate(int[] i)
    {
        int[] arr = new int[9];
        for(int j = 0; j < arr.length; j++)
        {
            int intensity = 55 + (5 * j);
            arr[j] = (int)Math.round((((220d - i[1]) - i[0]) * intensity/100d) + i[0]);
        }
        return arr;
    }

    public static void display(int[] arr)
    {
        System.out.print("\nIntensity\t| Rate\n-------------|--------\n");
        for(int i = 0; i < arr.length; i++)
        {
            int intensity = 55 + (5 * i);
            System.out.print(intensity + "\t| " + arr[i] + "bpm\n");
        }
    }
}
