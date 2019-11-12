package com.hackerrankday6letsreview.app;
import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        //Variables declaration
        int arrayElements = 0;
        String evenCad = "";
        String oddCad = "";

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input size of array
        arrayElements = in.nextInt();
        //Array declaration
        String arrayCad[] = new String[arrayElements];

        //Input cads
        for(int i = 0; i < arrayElements; i++)
        {
            arrayCad[i] = in.next();
        }

        //Process
        for(String element: arrayCad)
        {
            for(int i = 0; i < element.length(); i++)
            {
                //Validate if is even
                if(i % 2 == 0)
                {
                   evenCad += element.charAt(i);
                }
                else{
                    oddCad += element.charAt(i);
                }
            }
            System.out.println(evenCad+" "+oddCad);
            evenCad = "";
            oddCad = "";
        }

        //Close input
        in.close();
    }
}
