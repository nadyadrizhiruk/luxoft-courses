package ua.dp.drizhiruk.lesson2;

import ua.dp.drizhiruk.lesson2.sorting.InsertionSort;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int[] ints = ArrayWorkSupport.createNewFilledArray(10);

        new InsertionSort().sort(ints);

        System.out.println("Sorted array:");
        ArrayWorkSupport.printArray(ints);

        binarySearch(ints);

    }

    public static void binarySearch(int[] ints) {

        char continueSearch = ' ';
        Scanner in = new Scanner(System.in);
        do {

            System.out.print("Input an integer value for searching: ");

            while (!in.hasNextInt()) {

                System.out.print("That is not an integer! Try again:");
                in.next();
            }

            int searchedValue = in.nextInt();

            checkTheInterval(searchedValue, 0, ints.length - 1, ints);

            System.out.println("Do you want to continue? Y/N: ");

            in.nextLine();
            String s = in.nextLine();

            if (s.length() >= 1) {
               continueSearch = s.charAt(0);
           }
        }
        while ((continueSearch == 'Y') | (continueSearch == 'y'));
        in.close();
    }

    private static void checkTheInterval(int searchedValue, int startIndex, int endIndex, int[] ints) {

        if ((endIndex == startIndex)
                & (ints[endIndex] != searchedValue)) {

            System.out.println("Value is not found");
            return;
        }

        int midleIndex = startIndex + (endIndex - startIndex) / 2;
        int midleValue = ints[midleIndex];

        if (searchedValue > midleValue) {

            startIndex = ((midleIndex + 1) > endIndex) ? endIndex : (midleIndex + 1);

        } else if (searchedValue < midleValue) {

            endIndex = (((midleIndex - 1) < startIndex) ? startIndex : midleIndex - 1);

        } else if (searchedValue == midleValue) {

            System.out.println("The index of searched value  is " + midleIndex);
            return;
        }

        checkTheInterval(searchedValue, startIndex, endIndex, ints);

    }
}
