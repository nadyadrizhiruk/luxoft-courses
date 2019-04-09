package ua.dp.drizhiruk.lesson2.sorting;

public class MergeSort implements Sort {

    public void sort(int[] ints) {

        System.arraycopy(splitIntoItervalsAndMerge(ints), 0, ints, 0, ints.length);
    }

    private int[] splitIntoItervalsAndMerge(int[] ints) {

        if (ints.length < 2) {
            return ints;
        }
        int midleIndex = (ints.length) / 2 - 1;

        int[] firstHalf = new int[midleIndex + 1];
        int[] secondHalf = new int[ints.length - midleIndex - 1];

        System.arraycopy(ints, 0, firstHalf, 0, midleIndex + 1);
        System.arraycopy(ints, midleIndex + 1, secondHalf, 0, ints.length - midleIndex - 1);

        return merge(splitIntoItervalsAndMerge(firstHalf), splitIntoItervalsAndMerge(secondHalf));
    }

    private int[] merge(int[] firstArray, int[] secondArray) {

        int[] resultArray = new int[firstArray.length + secondArray.length];
        int index = 0, i = 0, j = 0;

        while (index < resultArray.length) {

            if ((i >= firstArray.length) | (j >= secondArray.length)) {
                break;
            }
            if (firstArray[i] < secondArray[j]) {

                resultArray[index] = firstArray[i];
                i++;
                index++;

            } else {

                resultArray[index] = secondArray[j];
                j++;
                index++;
            }
        }

        while (i < firstArray.length) {

            resultArray[index] = firstArray[i];
            i++;
            index++;
        }

        while (j < secondArray.length) {

            resultArray[index] = secondArray[j];
            j++;
            index++;
        }

        return resultArray;
    }

}
