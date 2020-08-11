import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class MaxPairwiseProduct {
    
    static BigInteger getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;
        
        int index1 = 0,index2 = 0;
        int max = numbers[index1];
        for(int i = 1; i < n; i++) {
        	if(numbers[i]>max) {max = numbers[i]; index1 = i;}
        }
        if(index1 == 0) {index2 = 1;}
        max = numbers[index2];
        for(int i = index2; i < n; i++) {
        	if(i != index1 && numbers[i]>max) {max = numbers[i]; index2 = i;}
        }
        	
        BigInteger max_product = BigInteger.valueOf(numbers[index1]).multiply(BigInteger.valueOf(numbers[index2]));

        return max_product;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
       BigInteger max_product2 = getMaxPairwiseProduct(numbers);
        System.out.println(max_product2);
       
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
