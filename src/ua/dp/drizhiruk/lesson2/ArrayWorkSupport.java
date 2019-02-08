package ua.dp.drizhiruk.lesson2;

import java.util.Random;

public class ArrayWorkSupport {

    public static int[] createNewFilledArray(int lenght) {

        Random rand = new Random();

        int[] items = new int[lenght];

        for (int i = 0; i < lenght; i++) {

            items[i] = rand.nextInt(200);
        }
        return items;
    }

    public static void printArray(int[] ints) {

        for (int i = 0; i < ints.length - 1; i++) {

            System.out.print(ints[i] + ", ");
        }
        System.out.println(ints[ints.length-1] + ".");

    }

    public static void switchItems(int[] ints, int firstIndex, int secondIndex) {

        int tmp = ints[firstIndex];
        ints[firstIndex] = ints[secondIndex];
        ints[secondIndex] = tmp;
    }

    public static void rightInsertion(int[] ints, int index, int newIndex) {

        int tmp = ints[index];

        for (int i = index; i < newIndex; i++) {

            ints[i] = ints[i + 1];
        }
        ints[newIndex] = tmp;
    }

    public static void leftInsertion(int[] ints, int index, int newIndex) {

        int tmp = ints[index];

        for (int i = index; i > newIndex; i--) {

            ints[i] = ints[i - 1];
        }
        ints[newIndex] = tmp;
    }
}
