package com.company;

public class Main {

    static void Assignment1()
    {
        int[] myArray = {5, 3, 7, 6, 2, 8};

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);

        for (int checkAll : myArray)
            System.out.println(checkAll); // this seemed the easiest for me

        int i = 0;
        while (i < myArray.length)
        {
            System.out.println(myArray[i]);
            i++;
        }
        do
            {
            System.out.println(myArray[i]);
            i++;
            }
        while (i < myArray.length);
    }

    static void Assignment2()
    {

        int[] myArray1 = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("Negative numbers: ");
        for (int i = 0; i < myArray1.length; i++)
        {
            if (myArray1[i] < 0)
            {
                System.out.println(myArray1[i]);
            }
        }

        System.out.println("Odd numbers: ");
        int oddCount = 0;

        for (int i = 0; i < myArray1.length; i++)
        {
            if (myArray1[i] % 2 != 0)
            {
                System.out.println(myArray1[i]);
                oddCount++;
            }
        }
        System.out.println("There are " + oddCount + " odd numbers");

        System.out.println("Dublicate verification: ");
        boolean doEqualsExist = false;
        for (int i = 0; i < 9; i++)
        {
            for (int j = i + 1; j < 10; j++)
            {
                if (myArray1[i] == myArray1[j])
                {
                    doEqualsExist = true;
                }
            }
        }
        if (doEqualsExist)
        {
            System.out.println("There are elements with the same value");
        } else
            {
            System.out.println("There are no elements with the same value");
            }

        System.out.println("Each second element: ");
        for (int i = 1; i < myArray1.length; i = i + 2)
        {
            System.out.println(myArray1[i]);
        }

        System.out.println("Calculating average: ");
        int sum = 0;
        for (int i = 0; i < myArray1.length; i++)
        {
            sum = sum + myArray1[i];
        }
        System.out.println("Element sum is: " + sum);
        double averageValue = sum / myArray1.length;
        System.out.println("The average value of the array is: " + averageValue);

        //System.out.println("Smaller than average : ");
        int smallerThanAverageCount = 0;

        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] < averageValue) {
                //System.out.println(myArray1[i]);
                smallerThanAverageCount++;
            }
        }
        System.out.println("There are " + smallerThanAverageCount + " elements smaller than average (" + averageValue + ")");
    }

    public static void main(String[] args) {
        Assignment1();
        Assignment2();
    }
}

