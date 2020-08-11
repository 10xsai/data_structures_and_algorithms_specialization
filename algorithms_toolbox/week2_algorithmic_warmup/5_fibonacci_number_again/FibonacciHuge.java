//package algorithmic_toolbox.week2;

import java.util.*;

public class FibonacciHuge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(fibonacciHuge(n, m));
    }

    public static long getFibonacci(long remainder, long m) {
        if (remainder == 0) {
            return 0;
        }
        if (remainder == 1 || remainder == 2) {
            return 1;
        }
        long prev = 1;
        long curr = 1;
        int count = 2;
        while (count != remainder) {
            long tmp_prev = prev;
            prev = curr;
            curr = (tmp_prev + prev) % m;
            count++;
        }
        return curr;
    }

    public static int getPisanoPeriod(long m) {
        long prev = 1;
        long curr = 1;
        int count = 2;
        while (true) {
            long tmp_prev = prev;
            prev = curr;
            curr = (tmp_prev + prev) % m;
            count++;
            if ((curr == 1) && (prev == 0)) {
                return count - 1;
            }
        }
    }

    public static long fibonacciHuge(long n, long m) {
        long pisanoPeriod = getPisanoPeriod(m);
        //System.out.println(pisanoPeriod);
        long remainder = n % pisanoPeriod;
        //System.out.println(remainder);
        long number = getFibonacci(remainder, m);
        //System.out.println(number);


        return (number % m);
    }
}

