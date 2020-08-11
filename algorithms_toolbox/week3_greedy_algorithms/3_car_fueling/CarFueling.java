import java.util.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
    	int count = 0; 
    	int currRefill = 0;
    	int n = stops.length-2;
    	while(currRefill <= n) {
    		int lastRefill = currRefill;
    		while((currRefill <= n) && (stops[currRefill+1] - stops[lastRefill] <= tank)) {
    			currRefill++;
    		}
    	if (currRefill == lastRefill) {return -1;}
    	if (currRefill <= n) {
    		count++;
    		}
    	}
    	return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n+2];
        for (int i = 1; i <= n; i++) {
            stops[i] = scanner.nextInt();
        }
        stops[n+1] = dist;
        System.out.println(computeMinRefills(dist, tank, stops));
        scanner.close();
    }
}
