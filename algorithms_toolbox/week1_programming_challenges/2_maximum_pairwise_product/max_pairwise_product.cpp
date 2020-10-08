#include <iostream>
#include <vector>
#include <algorithm>
#include "stress_test.cpp"

int MaxPairwiseProductNaive(const std::vector<int>& numbers) {
    int max_product = 0;
    int n = numbers.size();

    for (int first = 0; first < n; ++first) {
        for (int second = first + 1; second < n; ++second) {
            max_product = std::max(max_product,
                numbers[first] * numbers[second]);
        }
    }

    return max_product;
}

int64_t MaxPairwiseProduct(const std::vector<int>& numbers) {
    int n, currMax, firstMaxIndex;
    int64_t maxProduct = 1;
    n = numbers.size();
    currMax = 0;
    firstMaxIndex;
    for (int i = 0; i < n; i++) {
        if (numbers[i] > currMax) {
            currMax = numbers[i];
            firstMaxIndex = i;
        }
    }
    maxProduct *= currMax;
    currMax = 0;
    for (int i = 0; i < n; i++) {
        if (numbers[i] > currMax && i != firstMaxIndex) {
            currMax = numbers[i];
        }
    }
    maxProduct *= currMax;

    return maxProduct;
}

int main() {
    stressTest()
    int n;
    std::cin >> n;
    std::vector<int> numbers(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> numbers[i];
    }

    std::cout << MaxPairwiseProduct(numbers) << "\n";
    return 0;
}
