package p01_recursion;

public class TreeRecursion {
    public static void main(String[] args) {
        printVal(3);
    }

    static void printVal(int n) {
        if(n > 0) {
            System.out.print(n + " ");
            printVal(n - 1);
            printVal(n - 1);
        }
    }
}
