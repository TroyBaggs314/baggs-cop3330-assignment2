package ex39;

import java.util.*;


public class App
{
    public static void main(String[] args)
    {
        read(sort(setup()));
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

    public static List<Map> sort(List<Map> alDm)
    {
        List<Map> returnList = new ArrayList<>();
        HashMap<String, String> temp = new HashMap<>();
        for(int i = 0; i < 6; i++)
        {
            returnList.add(i,temp);
        }
        for(int i = 0; i < 6; i++)
        {
            int sortCount = 0;
            for(int j = 0; j < 6; j++)
            {
                if( alDm.get(i).values().toString().compareTo(alDm.get(j).values().toString()) < 0   )
                {
                    sortCount++;
                }
            }
            returnList.set((5-sortCount),alDm.get(i));
        }
        return returnList;
    }

    public static void read(List<Map> returnList)
    {
        System.out.println("Name\n-------------------");
        for(int i = 0; i < 6; i++)
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
