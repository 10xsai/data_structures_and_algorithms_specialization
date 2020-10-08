#include <iostream>
#define ll long long


ll get_fibonacci_last_digit(ll n, ll m) {
	ll temp, curr = 1, prev = 0;
	while (n--) {
			temp = curr+prev;
			prev = curr;
			curr = temp%m;
	}
	return prev;
}

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

ll get_fibonacci_huge_fast(ll n,ll m) {
	if (n<=1) {
		return n;
	}
	ll pisano_period = get_pisano_period(m);
	return get_fibonacci_last_digit(n%pisano_period, m);
}

long long get_fibonacci_huge_naive(long long n, long long m) {
    if (n <= 1)
        return n;

    long long previous = 0;
    long long current  = 1;

    for (long long i = 0; i < n - 1; ++i) {
        long long tmp_previous = previous;
        previous = current;
        current = tmp_previous + current;
    }

    return current % m;
}

int main() {
    long long n, m;
    std::cin >> n >> m;
    std::cout << get_fibonacci_huge_fast(n, m) << '\n';
}
