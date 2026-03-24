package p01_recursion;

public class HeadRecursion {
    public static void main(String[] args) {
        printVal(3);
    }

    public static void printVal(int i) {
        if(i > 0) {
            printVal(i - 1);
            System.out.println(i);
        }
    }
}
