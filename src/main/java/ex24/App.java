/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex24;
import java.util.Locale;
import java.util.Scanner;
import ex24.Words;

public class App
{

    public static void main(String[] args)
    {
        Words w = new Words();
        w = input(w);
        if(isAnagram(w) == true)
        {
            System.out.println("\""+w.word1+"\" and \"" +w.word2+"\" are anagrams.");
        }
        else
        {
            System.out.println("\""+w.word1+"\" and \"" +w.word2+"\" are not anagrams.");
        }
    }

    public static boolean isAnagram(Words w)
    {
        if(w.word1.length() != w.word2.length())
        {
            return false;
        }
        w.word1.toLowerCase();
        w.word2.toLowerCase();
        char[] array1 = w.word1.toCharArray();
        char[] array2 = w.word2.toCharArray();
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] != array2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static Words input(Words w)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        w.word1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        w.word2 = sc.nextLine();
        return w;
    }
}


