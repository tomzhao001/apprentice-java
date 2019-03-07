package sort.insert;

import sort.ISort;

public class InsertionSort implements ISort {

    public void sort(Integer[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayToSort[j] < arrayToSort[j - 1]) {
                    Integer temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j - 1];
                    arrayToSort[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

}
