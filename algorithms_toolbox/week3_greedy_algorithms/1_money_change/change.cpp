#include <iostream>

int get_change(int m) {
	int coins[3] = {1, 5, 10};
	int count = 0;
	for (int i = 2; i >= 0; i--)  {
			count += m/coins[i];
			m %= coins[i];
	}
  return count;
}

int main() {
  int m;
  std::cin >> m;
  std::cout << get_change(m) << '\n';
}
