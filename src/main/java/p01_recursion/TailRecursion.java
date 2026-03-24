package p01_recursion;

public class TailRecursion {
    public static void main(String[] args) {
        printVal(3);
    }

    public static void printVal(int i) {
        if(i > 0) {
            System.out.println(i);
            printVal(i - 1);
        }
    }
}
