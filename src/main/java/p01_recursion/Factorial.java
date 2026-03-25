package p01_recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
    }

    static int factorialRecursive(int n) {
        if(n < 0)
            return -1;
        if(n == 0)
            return 1;
        return factorialRecursive(n - 1) * n;
    }

    static int factorialIterative(int n) {
        int r = 1;

        for (int i = 1; i <= n; i++) {
            r = r * i;
        }

        return r;
    }
}
