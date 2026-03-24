package p01_recursion;

public class NestedRecursion {
    public static void main(String[] args) {
        System.out.print(funcA(95) + " ");
    }

    static int funcA(int n) {
        if(n > 100) {
            return (n - 10);
        }

        return funcA(funcA(n + 11));

    }
}
