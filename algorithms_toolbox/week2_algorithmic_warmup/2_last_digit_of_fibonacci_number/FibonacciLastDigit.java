import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
	private static int getFibonacciLastDigitFast(int n) {
		if(n<=1) {return n;}
		int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (current + tmp_previous)%10;
        }

        return current;
	}
	/*
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current += tmp_previous;
        }

        return current % 10;
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = getFibonacciLastDigitFast(n);
        System.out.println(d);
        
   /*
        while(true) {
    	Random rand = new Random();
        int n = rand.nextInt(20);
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
        int d = getFibonacciLastDigitFast(n);
        System.out.println(d);
        Fibonacci fibb = new Fibonacci();
        BigInteger b = fibb.calc_fib(n);
        System.out.println(b);
        BigInteger e = b.remainder(BigInteger.valueOf(10));
        System.out.println(e);
        System.out.println(BigInteger.valueOf(d).equals(e) ? "YES":"NO");
        if(!BigInteger.valueOf(d).equals(e)) {break;}
    	}*/
    }
}

