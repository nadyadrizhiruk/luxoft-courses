package ua.dp.drizhiruk.lesson2.sorting;

public class SelectionSort extends Sort{

    public void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {

            int min = ints[i];
            int index = i;

            for (int j = i + 1; j < ints.length; j++) {
                if (min > ints[j]) {

                    min = ints[j];
                    index = j;
                }
            }

            ints[index] = ints[i];
            ints[i] = min;

        }


    }
}
