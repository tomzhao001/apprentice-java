package sort.util;

import java.util.Date;
import java.util.Random;

public class RandomArrayUtil {

    public static Integer[] getRandomIntArray(int size) {
        Integer[] randomIntArray = new Integer[size];
        Random randomSource = new Random(new Date().getTime());
        for (int i = 0; i < size; i++) {
            randomIntArray[i] = randomSource.nextInt(100);
        }
        return randomIntArray;
    }

}
