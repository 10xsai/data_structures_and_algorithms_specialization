/*import java.util.Random;*/
import java.util.Scanner;
import java.math.*;

public class Fibonacci {
	
/*	private static BigInteger calc_fib(int n) {
	    if (n <= 1)
	      return BigInteger.valueOf(n);

	    return calc_fib(n - 1).add(calc_fib(n - 2));
	  }
*/
  public static BigInteger calc_fib(int n) {
    if (n <= 1)
      return BigInteger.valueOf(n);

    BigInteger[] fibb = new BigInteger[n+1];
    fibb[0] = BigInteger.valueOf(0);
    fibb[1] = BigInteger.valueOf(1);
    for(int i = 2; i < n+1; i++) {
    	fibb[i] = fibb[i-1].add(fibb[i-2]);
    }return fibb[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
/*
    System.out.println(calc_fib_fast(n)); 

	
    while(true) {
    	Random rand_int = new Random();
    	int n = rand_int.nextInt(50);
    	System.out.println(n);
    	System.out.println(calc_fib(n)+"    =    "+calc_fib_fast(n));
    	if(calc_fib(n).equals(calc_fib_fast(n))) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    		break;
    	}
    }
    */
    
  }
}
