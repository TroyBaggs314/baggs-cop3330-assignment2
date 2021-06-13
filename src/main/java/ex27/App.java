package ex27;
import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        employeeCredentials ec = prompts();
        validateInput(ec);
    }

    public static employeeCredentials prompts()
    {
        Scanner sc = new Scanner(System.in);
        employeeCredentials ec = new employeeCredentials();
        System.out.println("Enter the first name: ");
        ec.fName = sc.nextLine();
        System.out.println("Enter the last name: ");
        ec.lName = sc.nextLine();
        System.out.println("Enter the ZIP code: ");
        ec.zipCode = sc.next();
        System.out.println("Enter the employee ID: ");
        ec.id = sc.next();
        return ec;
    }

    public static void validateInput(employeeCredentials ec)
    {
        String result = "";
        if(validateFirstName(ec) > 0)
        {
            if(validateFirstName(ec) == 1)
            {
                result += ("The first name must be at least 2 characters long.\n");
            }
            else
            {
                result += ("The first name must be at least 2 characters long.\nThe first name must be filled out.\n");
            }
        }
        if(validateLastName(ec) > 0)
        {
            if(validateLastName(ec) == 1)
            {
                result += ("The last name must be at least 2 characters long.\n");
            }
            else
            {
                result += ("The last name must be at least 2 characters long.\nThe last name must be filled out.\n");
            }
        }
        if(validateID(ec) == false)
        {
            result += ("The employee ID must be in the format of AA-1234.\n");
        }
        if(validateID(ec) == false)
        {
            result += ("The zipcode must be a 5 digit number.\n");
        }
        if(validateFirstName(ec) == 0 && validateLastName(ec) == 0 && validateID(ec) == true && validateID(ec) == true)
        {
            result = ("There were no errors found.");
        }
        System.out.println(result);
    }
    public static int validateFirstName(employeeCredentials ec)
    {
        if(ec.fName.length() < 2 && ec.fName.length() != 0)
        {
            return 1;
        }
        if(ec.fName.length() == 0)
        {
            return 2;
        }
        return 0;
    }
    public static int validateLastName(employeeCredentials ec)
    {
        if(ec.lName.length() < 2 && ec.lName.length() != 0)
        {
            return 1;
        }
        if(ec.lName.length() == 0)
        {
            return 2;
        }
        return 0;
    }
    public static boolean validateID(employeeCredentials ec)
    {
        ec.id.toLowerCase();
        char[] zc = ec.id.toCharArray();
        if(zc.length > 7 || zc.length < 7 )
        {
            return false;
        }
        for(int i = 0; i < zc.length; i++)
        {
            if(i < 2)
            {
                if(Character.isLetter(zc[i]) == false)
                {
                    return false;
                }
            }
            else if(i == 2)
            {
                if(zc[i] != '-')
                {
                    return false;
                }
            }
            else if(i > 2)
            {
                if(Character.isDigit(zc[i]) == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean validateZipCode(employeeCredentials ec)
    {
        char[] zc = ec.zipCode.toCharArray();
        if(zc.length < 5 || zc.length > 5)
        {
            return false;
        }
        for(int i = 0; i < zc.length; i++)
        {
            if (Character.isDigit(zc[i]) == false)
            {
                return false;
            }
        }
        return true;
    }
}
