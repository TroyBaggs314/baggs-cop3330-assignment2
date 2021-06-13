package ex40;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App
{
    public static void main(String[] args)
    {
        read(search(input()));
    }

    public static String input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a search string: ");
        return sc.nextLine();
    }

    public static List<Map> search(String s)
    {
        List<Map> alDm = setup();
        List<Map> result = new ArrayList<>();

        for(int i = 0, k = 0; i < alDm.size(); i++)
        {
            String str = alDm.get(i).values().toString();
            if(str.indexOf(s) >= 0)
            {
                result.add(alDm.get(i));
                k++;
            }
        }
        return result;
    }

    public static List<Map> setup()
    {
        List<Map> alDm = new ArrayList<>();
        HashMap<String, String> flName1 = new HashMap<>();
        HashMap<String, String> flName2 = new HashMap<>();
        HashMap<String, String> flName3 = new HashMap<>();
        HashMap<String, String> flName4 = new HashMap<>();
        HashMap<String, String> flName5 = new HashMap<>();
        HashMap<String, String> flName6 = new HashMap<>();
        flName1.put("John","Johnson");
        flName2.put("Tou","Xiong");
        flName3.put("Michaela","Michaelson");
        flName4.put("Jake","Jacobson");
        flName5.put("Jacquelyn","Jackson");
        flName6.put("Sally","Webber");
        alDm.add(flName1);
        alDm.add(flName2);
        alDm.add(flName3);
        alDm.add(flName4);
        alDm.add(flName5);
        alDm.add(flName6);
        return alDm;
    }

    public static void read(List<Map> returnList)
    {
        System.out.println("Name\n-------------------");
        for(int i = 0; i < returnList.size(); i++)
        {
            String str = returnList.get(i).values().toString();
            str = str.substring(1,str.length()-1);
            String str2 = returnList.get(i).keySet().toString();
            str2 = str2.substring(1,str2.length()-1);
            str = str2 + " " + str;

            System.out.println(str);
        }
    }
}
