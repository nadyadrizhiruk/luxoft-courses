package ua.dp.drizhiruk.lesson2.sorting.quick;

public class DoSort {

    public static void main(String[] args) {

        int[] b = {10, 5, 8, 4, 54, 65, 45, 7, 1, 2, 4, 6, 1, 5, 1, 0, 65, 7, 8, 9, 4, 5, 1, 1, 2, 6, 55, 4, 5, 6};

        QuickSort q = new QuickSort();
        q.sortArray(b, 0, 29);

        for (int i : b) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
