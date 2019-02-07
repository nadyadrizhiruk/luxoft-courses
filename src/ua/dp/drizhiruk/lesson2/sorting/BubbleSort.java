package ua.dp.drizhiruk.lesson2.sorting;

public class BubbleSort extends Sort{

    public void sort(int[] ints) {

        for (int i = 0; i < ints.length; i++) {

            boolean isSortingNided = false;

            for (int j = ints.length - 1; j > i; j--) {

                if (ints[j] < ints[j - 1]) {

                    int tmp = ints[j];
                    ints[j] = ints[j - 1];
                    ints[j - 1] = tmp;

                    isSortingNided = true;
                }
            }

            if (!isSortingNided) {
                break;
            }
        }
    }
}
