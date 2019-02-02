package ua.dp.drizhiruk.lesson2.sorting.quick;

class QuickSort {

    private int pivotIndex(int[] b, int firstIndex, int lastIndex) {

        return firstIndex + (lastIndex - firstIndex) / 2;
    }

    public void sortArray(int[] b, int firstIndex, int lastIndex) {

        if (firstIndex == lastIndex) {

            return;

        }

        int pivotIndex = pivotIndex(b, firstIndex, lastIndex);

        for (int i = firstIndex; i <= lastIndex; i++) {

            if ((b[i] > b[pivotIndex]) & (i < pivotIndex)) {

                int tmp = b[i];
                b[i] = b[pivotIndex];
                b[pivotIndex] = tmp;
                pivotIndex = i;
            }

            if ((b[i] < b[pivotIndex]) & (i > pivotIndex)) {

                int tmp = b[i];

                for (int j = i; j > pivotIndex; j--) {
                    b[j] = b[j - 1];
                }

                b[pivotIndex] = tmp;
                pivotIndex += 1;
            }

        }

        if (firstIndex < pivotIndex - 1) {
            sortArray(b, firstIndex, pivotIndex - 1);
        }
        if ((pivotIndex + 1) < lastIndex) {
            sortArray(b, pivotIndex + 1, lastIndex);
        }
    }
}

