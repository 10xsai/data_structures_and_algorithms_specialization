import java.util.*;

public class GCD {
  /*
	private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }
  */
  private static int gcd_fast(int a, int b) {
	  if(b==0) {return a;}
	  return gcd_fast(b, a % b);
  }

  public static void main(String args[]) {
    
	  Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_fast(a, b));
    
    /*
	  
	  Random rand = new Random();
	  while(true) {
		  int a = rand.nextInt(10000)+1, b = rand.nextInt(10000)+1;
		  System.out.println(gcd_naive(a, b) +"   =   "+gcd_fast(a,b));
		  if(gcd_naive(a, b)==gcd_fast(a, b)) {
			  System.out.println("YES");}
		  else {System.out.println("NO");break;}
	  }
	  */
  }
}
