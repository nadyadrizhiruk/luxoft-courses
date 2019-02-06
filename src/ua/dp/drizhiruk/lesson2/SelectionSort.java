package ua.dp.drizhiruk.lesson2;

public class SelectionSort {

    public static void main(String[] args) {

        int[] ints = {10, 5, 8, 4, 54, 65, 45, 7, 1, 2, 4, 6, 1, 5, 1, 0, 65, 7, 8, 9, 4, 5, 1, 1, 2, 6, 55, 4, 5, 6};

        sort(ints);

        for (int n : ints) {
            System.out.println(n);
        }
    }

    public static void sort(int[] ints) {

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
