package ua.dp.drizhiruk.lesson2.sorting;

import ua.dp.drizhiruk.lesson2.ArrayWorkSupport;

public class CheckSort {

    public static void main(String[] args) {

        check(new InsertionSort(), 20, "Insertion sort:");
        check(new SelectionSort(), 20, "Selection sort:");
        check(new QuickSort(), 20, "Quick sort:");
        check(new BubbleSort(), 20, "Bubble sort:");
    }

    public static void check(Sort sorter, int amountElementsOfArray, String info){

        System.out.println("___________________________________");
        System.out.println(info);

        int[] ints= ArrayWorkSupport.createNewFilledArray(amountElementsOfArray);

        System.out.println("Original array:");
        ArrayWorkSupport.printArray(ints);

        sorter.sort(ints);

        System.out.println("Sorted array:");
        ArrayWorkSupport.printArray(ints);
    }
}
