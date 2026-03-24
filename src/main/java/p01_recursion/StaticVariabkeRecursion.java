package p01_recursion;

public class StaticVariabkeRecursion {
    static int x = 0;

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printVal(n));
    }

    static int printVal(int n) {
        int i = 0;
        if(n > 0) {
           x++;
           i = printVal(n - 1) + x;
        }
        return i;
    }
}
