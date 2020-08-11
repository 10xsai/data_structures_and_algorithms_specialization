//package algorithmic_toolbox.week2;
import java.util.*;

public class FibonacciSumLastDigit {
    private static int getFibonacciSumFast(long n) {
        if(n<=1) {return (int)n;}
        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (current + tmp_previous) % 10;
        }

        return ((previous + current) * current) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int s = getFibonacciSumFast(n);
        System.out.println(s);
    }
}

