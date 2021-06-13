package ex25;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String s = prompt();
        response(s);
    }

    public static String prompt()
    {
        System.out.println("Enter a new password");
        return input();
    }

    public static void response(String s)
    {
        if(passwordValidator(s) <= 1)
        {
            System.out.println("The password '"+ s + "' is a very weak password.");
        }
        else if(passwordValidator(s) == 2 || passwordValidator(s) == 3)
        {
            System.out.println("The password '"+ s + "' is a weak password.");
        }
        else if(passwordValidator(s) == 4)
        {
            System.out.println("The password '"+ s + "' is a strong password.");
        }
        else if(passwordValidator(s) == 5)
        {
            System.out.println("The password '"+ s + "' is a very strong password.");
        }
    }
    public static int passwordValidator(String s)
    {
        int returnVal = 0;
        if(s.length() >= 8)
        {
            returnVal++;
        }
        boolean hasLetters = false;
        boolean hasDigits = false;
        boolean hasSpecials = false;

        s.toLowerCase();
        char[] array1 = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
        {
            if(java.lang.Character.isLetter(array1[i]))
            {
                hasLetters = true;
            }
            if(java.lang.Character.isDigit(array1[i]))
            {
                hasDigits  = true;
            }
            if((array1[i] < 65 && array1[i] > 57) ||  (array1[i] < 127 && array1[i] > 122) || (array1[i] < 97 && array1[i] > 90) || (array1[i] < 48 && array1[i] > 32)) //checks for special chars
            {
                hasSpecials  = true;
            }
        }
        if(hasDigits == true)
        {
            returnVal++;
        }
        if(hasLetters == true)
        {
            returnVal += 2;
        }
        if(hasSpecials == true)
        {
            returnVal++;
        }
        return returnVal;
    }
    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
