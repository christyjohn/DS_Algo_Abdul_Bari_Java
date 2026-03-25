package p01_recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3, 4));
        System.out.println(impPower(3, 4));
    }

    static int power(int m, int n) {
        if(n == 0)
            return 1;
        return power(m, n-1) * m;
    }

    static int impPower(int m, int n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return impPower(m * m, n/2);
        return impPower(m*m, (n-1)/2) * m;
    }
}
