package ua.dp.drizhiruk.lesson2.sorting;

import ua.dp.drizhiruk.lesson2.ArrayWorkSupport;

public class BubbleSort implements Sort {

    public void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {

            boolean isSortingNeeded = false;

            for (int j = ints.length - 1; j > i; j--) {

                if (ints[j] < ints[j - 1]) {

                    ArrayWorkSupport.switchItems(ints,j,j-1);

                    isSortingNeeded = true;
                }
            }

            if (!isSortingNeeded) {
                break;
            }
        }
    }
}
