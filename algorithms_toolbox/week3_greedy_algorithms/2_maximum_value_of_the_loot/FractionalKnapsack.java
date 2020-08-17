
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int n = values.length;
        //write your code here
        boolean bool[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            bool[i] = true;
        }
        int index = 0;
        while (capacity > 0) {
            double max = 0;
            for (int i = 0; i < n; i++) {
                if (!bool[i])
                    continue;
                double ratio;
                ratio = (float) values[i] / (float) weights[i];
                if (ratio > max) {
                    max = ratio;
                    index = i;
                }
            }
            int weight = weights[index];
            if (capacity >= weight && bool[index]) {
                capacity -= weight;
                value += values[index];
            } else if (bool[index]){
                value += (float) (values[index] * capacity) / (float) weight;
                capacity = 0;
            }
            bool[index] = false;
            System.out.println(capacity);
        }

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.printf("%.4f",getOptimalValue(capacity, values, weights));
    }
}
