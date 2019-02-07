package ua.dp.drizhiruk.lesson2.sorting;

import java.util.Random;

public class SortSupport {

    public int[] createNewFilledArray(int lenght) {

        Random rand = new Random();

        int[] items = new int[lenght];

        for (int i = 0; i < lenght; i++) {

            items[i] = rand.nextInt(200);
        }
        return items;
    }

    public void printArray(int[] ints) {

        for (int n : ints) {

            System.out.print(n + ", ");
        }
        System.out.println("");

    }
}
