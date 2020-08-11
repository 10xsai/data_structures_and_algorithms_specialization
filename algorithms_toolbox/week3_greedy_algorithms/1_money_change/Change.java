import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
    	int numCoins = 0;
    	int[] d = {10, 5, 1};
    	for(int i = 0; i < d.length; i++) {
    		if(m > 0) {
    			numCoins += m / d[i];
    			m %= d[i];
    		}else {break;}
    	}
        return numCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

