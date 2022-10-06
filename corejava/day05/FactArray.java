package com.valtech.training.corejava.day05;

import java.util.*;
public class FactArray
{
    public static void main(String [] args)
    {
        int factorialA[] = new int[5];
        for (int i=1; i<6; i++)
        {
            int factorial = 1;
            for(int j=1; j<=i; j++)
            {
                factorial = factorial *j;
            }
            factorial = factorialA[i];
        }
        System.out.println(factorialA[3]);
    }
}
