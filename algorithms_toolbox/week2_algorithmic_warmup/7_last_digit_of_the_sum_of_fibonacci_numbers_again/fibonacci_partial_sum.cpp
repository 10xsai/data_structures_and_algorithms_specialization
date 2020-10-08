#include <iostream>
#include <vector>
using std::vector;

#define ll long long


ll get_pisano_period(ll m) {
	ll prev = 0, curr=1, temp;
	ll index = 0;
	while (!(prev==0 && curr==1 && index!=0)) { 
			temp = prev+curr;
			prev = curr%m;
			curr = temp%m;
			index++;
	}
	return index;
}

int fibonacci_sum_fast(ll n) {
	n = n%get_pisano_period(10);
	int sum = 0;
	int temp, curr =1,prev=0;
	while (n--){
		temp = curr+prev;
		prev=curr;
		curr=temp%10;
		sum+=prev;
	}
	return sum%10;
}

ll get_fibonacci_partial_sum_fast(ll from,ll to) {
	return abs(fibonacci_sum_fast(to)-fibonacci_sum_fast(from-1));
}

long long get_fibonacci_partial_sum_naive(long long from, long long to) {
    long long sum = 0;

    long long current = 0;
    long long next  = 1;

    for (long long i = 0; i <= to; ++i) {
        if (i >= from) {
            sum += current;
        }

        long long new_current = next;
        next = next + current;
        current = new_current;
    }

    return sum % 10;
}

int main() {
    long long from, to;
    std::cin >> from >> to;
    std::cout << get_fibonacci_partial_sum_fast(from, to) << '\n';
}
