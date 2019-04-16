package memory;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryTest {

    public static void main(String[] args) {

        // 1. 因为每开一个线程需要消耗大约2MB的内存，无限地开新线程会导致 OutOfMemeory
        //endlessRecursionInThreads("Hello ");

        // 2. 每次申请一些堆内存，放入一个List中，会导致这个List的大小比堆内存还大，导致溢出。
        // Note: 如果不放在一个List或者集合中，每次申请的内存会因为满了触发GC，就不会出现内存溢出的错误了。
        endlessLoopWithMemoryStore();

    }

    private static void endlessRecursionInThreads(String test) {
        while (true) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    endlessRecursionInThreads(test + "Tom");
                }
            }).start();
        }
    }

    private static void endlessLoopWithMemoryStore() {
        List<Byte[]> bigByte = new ArrayList<>();
        while (true) {
            Byte[] b = new Byte[1024*1024*30];
            bigByte.add(b);
        }
    }

}
