package p01_recursion;

public class ConvertTailRecursionToLoop {
    public static void main(String[] args) {
        printVal(3);
    }

    static void printVal(int n) {
        while(n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
