package memory;

public class StackOverflowTest {

    public static void main(String[] args) {

        // StackOverflow 是在栈中发生的，每执行一个方法，会在栈顶放入一个栈帧
        // 当栈的深度超过限额时，就发生了 StackOverflow
        endlessRecursion("Hello ");

    }

    private static void endlessRecursion(String test) {
        while (true) {
            endlessRecursion(test + "Tom");
        }
    }

}
