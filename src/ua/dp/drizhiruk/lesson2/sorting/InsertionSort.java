package ua.dp.drizhiruk.lesson2.sorting;

public class InsertionSort implements Sort{


    public void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {

            int j = i - 1;
            int tmp = ints[i];

            while ((j >= 0) && (tmp < ints[j])) {

                ints[j + 1] = ints[j];
                j--;
            }

            if (j != (i - 1)) {

                ints[j + 1] = tmp;
            }
        }
    }
}
