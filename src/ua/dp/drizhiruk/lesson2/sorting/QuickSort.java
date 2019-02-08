package ua.dp.drizhiruk.lesson2.sorting;

import ua.dp.drizhiruk.lesson2.ArrayWorkSupport;

class QuickSort extends Sort {

    private int pivotIndex(int firstIndex, int lastIndex) {

        return firstIndex + (lastIndex - firstIndex) / 2;
    }

    public void sort(int[] ints) {

        sortIntervals(ints, 0, ints.length - 1);
    }

    private void sortIntervals(int[] ints, int firstIndex, int lastIndex) {

        if (firstIndex == lastIndex) {

            return;
        }

        int pivotIndex = pivotIndex(firstIndex, lastIndex);
        int i;
        int j = lastIndex;

        //switching places between right bigger then pivot elements and left less then pivot elements

        for (i = firstIndex; ((i < pivotIndex) & (j > pivotIndex)); i++) {

            if (ints[i] > ints[pivotIndex]) {

                for (; j > pivotIndex; j--) {

                    if (ints[j] < ints[pivotIndex]) {

                        ArrayWorkSupport.switchItems(ints, i, j);
                        j--;
                        break;
                    }
                }
            }
        }

        i = (i > 0) ? i - 1 : 0;

        // putting into right position elements remaining into wrong place
        //from left or right side of pivot element

        while (i < pivotIndex) {
            if (ints[i] > ints[pivotIndex]) {
                ArrayWorkSupport.rightInsertion(ints, i, pivotIndex);
                pivotIndex = pivotIndex - 1;
            } else {
                i++;
            }
        }

        while (j > pivotIndex) {
            if (ints[j] < ints[pivotIndex]) {
                ArrayWorkSupport.leftInsertion(ints, j, pivotIndex);
                pivotIndex = pivotIndex + 1;
            } else {
                j--;
            }
        }

        if (firstIndex < pivotIndex - 1) {
            sortIntervals(ints, firstIndex, pivotIndex - 1);
        }
        if ((pivotIndex + 1) < lastIndex) {
            sortIntervals(ints, pivotIndex + 1, lastIndex);
        }
    }
}


