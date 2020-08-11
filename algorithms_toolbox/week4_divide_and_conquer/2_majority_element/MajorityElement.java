
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a) {
        int n = a.length;
        if (n == 1) return 1;
        int count = 1;
        int index = 0;
        for (int i = 1; i < n; i++)
        {
        	if (a[i] == a[index])
        	{
        		count++;
        	}
        	else
        	{
        		count--;
        	}
        	if (count == 0)
        	{
        		index = i;
        		count = 1;
        	}
        }
        count = 0;
        int majElement = a[index];
        for (int i = 0; i < n; i++) {
        	if (majElement == a[i]) {
        		count ++;
        	}
        }
        return (count > (n / 2)) ? 1 : 0;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getMajorityElement(a));
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
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

