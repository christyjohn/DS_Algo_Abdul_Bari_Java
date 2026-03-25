package p01_recursion;

public class SumOfFirstNNaturalNums {
    public static void main(String[] args) {
        System.out.println(sumNIterative(5));
        System.out.println(sumNRecursive(5));
    }

    static int sumNIterative(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    static int sumNRecursive(int n) {
        if(n > 0)
            return sumNRecursive(n - 1 ) + n;

        return 0;
    }
}
