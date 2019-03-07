package sort;

import sort.util.RandomArrayUtil;

import java.util.Arrays;

public class SortActions {

    private ISort sortMethod;

    public SortActions(ISort sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void doSort(int arraySize) {
        Integer[] arrayToSort = RandomArrayUtil.getRandomIntArray(arraySize);
        System.out.println("Array before sorting: " + Arrays.asList(arrayToSort));
        sortMethod.sort(arrayToSort);
        System.out.println("Array after sorting: " + Arrays.asList(arrayToSort));
    }

}
