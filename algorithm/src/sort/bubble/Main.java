package sort.bubble;

import sort.util.RandomArrayUtil;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arrayToSort = RandomArrayUtil.getRandomIntArray(20);
        System.out.println("Array before sorting: " + Arrays.asList(arrayToSort));

        new BubbleSort().sort(arrayToSort);
        System.out.println("Array after sorting: " + Arrays.asList(arrayToSort));
    }

}
