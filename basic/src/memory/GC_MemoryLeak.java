package memory;

import java.util.Vector;

public class GC_MemoryLeak {

    public static void main(String[] args) {

        Vector vector = new Vector();

        while (true) {
            Object obj = new Byte[1024*1024*30];
            vector.add(obj);
            //obj = null;
        }

    }

}
