package ua.dp.drizhiruk.lesson2.sorting;

public class InsertionSort {


    public static void main(String[] args) {

        int[] ints = {10, 5, 8, 4, 54, 65, 45, 7, 1, 2, 4, 6, 1, 5, 1, 88, 65, 7, 8, 9, 4, 5, 1, 1, 2, 6, 55, 4, 5, 6};

        sort(ints);

        for (int n : ints) {
            System.out.println(n);
        }
    }

    private static void sort(int[] ints) {

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
