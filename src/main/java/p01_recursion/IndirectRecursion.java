package p01_recursion;

public class IndirectRecursion {
    public static void main(String[] args) {
        printValA(20);
    }

    static void printValA(int n) {
        if(n > 0) {
            System.out.print(n + " ");
            printValB(n - 1);
        }
    }

    static void printValB(int n) {
        if(n > 0) {
            System.out.print(n + " ");
            printValA(n/2);
        }
    }
}
