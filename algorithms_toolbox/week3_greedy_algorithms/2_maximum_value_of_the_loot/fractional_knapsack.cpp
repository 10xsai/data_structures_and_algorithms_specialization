#include <iostream>
#include <vector>
#include <cstdio>
using std::vector;


double get_optimal_value(int capacity, vector<int> weights, vector<int> values, int n) {
	double value=0.0;
	for (int i = 0; i < n; i++) {
		if (capacity==0) return value;
		double max_ratio = 0, curr_ratio; int max_index;
		for (int j = 0; j < n; j++) {
			if (weights[j] <= 0) continue;
			curr_ratio = values[j]/(double)weights[j];
			if (curr_ratio > max_ratio) {
					max_ratio = curr_ratio;
					max_index = j;
			}
		}
		//std::cout << max_ratio << std::endl;
		double a = std::min(weights[max_index], capacity);
		value += a*(max_ratio);
		values[max_index] -= a*(max_ratio);
		//std::cout << a*(max_ratio) << std::endl;
		weights[max_index] -= a;
		capacity -= a;
	}
	return value;
}

int main() {
  int n;
  int capacity;
  std::cin >> n >> capacity;
  vector<int> values(n);
  vector<int> weights(n);
  for (int i = 0; i < n; i++) {
    std::cin >> values[i] >> weights[i];
  }

  double optimal_value = get_optimal_value(capacity, weights, values,n);

	printf("%.4f\n",optimal_value);
  return 0;
}
