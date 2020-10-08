//
// Created by gdsvs on 25-09-2020.
//

#include <iostream>
#include <random>

using namespace std;

std::vector<int> random_array(int n) {
    std::vector<int> numbers(n);
    for (int i = 0; i < n; ++i) {
        numbers[i] = rand();
    }
    return numbers;
}

void stressTest(int n) {
    while (true) {
        std::vector<int> numbers = random_array(n);
    }
}