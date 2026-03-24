package p01_recursion;

public class ConvertHeadRecursionToLoop {
    public static void main(String[] args) {
        printVal(3);
    }

    static void printVal(int n) {
        int i = 1;

        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
