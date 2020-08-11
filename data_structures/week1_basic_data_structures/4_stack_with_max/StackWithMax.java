

import java.util.*;
import java.io.*;

public class StackWithMax {
	class SpecialStack extends Stack<Integer> 
	{
		Stack<Integer> max = new Stack<>();
		void push(int x) 
		{
			if (isEmpty())
			{
				super.push(x);
				max.push(x);
			}
			else 
			{
				super.push(x);
				int y = max.pop();
				max.push(y);
				if (x >= y)
					max.push(x);
			}
		}
		
		public Integer pop()
		{
			int x = super.pop();
			int y = max.pop();
			
			if (y != x)
				max.push(y);
			return x;
		}
		
		int getMax()
		{
			int x = max.pop();
			max.push(x);
			return x;
		}
	}
	
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        SpecialStack stack = new SpecialStack();

        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if ("pop".equals(operation)) {
                stack.pop();
            } else if ("max".equals(operation)) {
                System.out.println(stack.getMax());
            }
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}

