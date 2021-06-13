package ex34;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        list(getEmployees());
        removeEmployee(getEmployees(),promptRemoval());
    }
    public static String[] getEmployees()
    {
        return new String[]{"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
    }
    public static void list(String[] s)
    {
        System.out.println("There are " + s.length + " employees:");
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
    }

    public static String promptRemoval()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an employee name to remove: ");
        return sc.nextLine();
    }

    public static String[] removeEmployee(String[] arr, String s)
    {
        String[] tempArr = new String[arr.length - 1];
        for(int i = 0,k = 0; i < arr.length; i++)
        {
            if(arr[i].equals(s))
            {
                continue;
            }
            tempArr[k++] = arr[i];
        }
        arr=tempArr;
        list(arr);
        return arr;
    }
}
