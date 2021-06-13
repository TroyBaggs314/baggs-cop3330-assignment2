package ex30;

import java.text.DecimalFormat;

public class App
{
    public static void main(String[] args)
    {
        readArr(populateArr(createArr()));
    }

    public static int[][] createArr()
    {
        return new int[12][12];
    }

    public static int[][] populateArr(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                arr[i][j] = (i+1) * (j+1);
            }
        }
        return arr;
    }

    public static void readArr(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.print(String.format("%5d",arr[i][j]));
            }
            System.out.print("\n");
        }
    }

}
