package sort.bubble;

import sort.ISort;

public class BubbleSort implements ISort {

    public void sort(Integer[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    // swap 2 numbers
                    Integer temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
    }

}
