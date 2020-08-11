import java.util.*;

public class LCM {
  private static long gcd_fast(long a, long b) {
	  if(b==0) {return a;}
	  return gcd_fast(b, a % b);
  }
  
  private static long lcm_fast(long a, long b) {
	  long product = a*b;
	  return product/gcd_fast(a, b);
  }
/*
  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }
*/
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm_fast(a, b));
    /*
    Random rand = new Random();
    while(true) {
    	int a = rand.nextInt(20)+1;
    	int b = rand.nextInt(30)+1;
    	System.out.println(a+"  ,  "+b);
    	System.out.println(lcm_naive(a, b)+"    =    "+lcm_fast(a, b));
    	System.out.println(lcm_naive(a, b)==lcm_fast(a, b) ? "YES":"NO");
    }
    */
  }
}
