#include <iostream>
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


int fibonacci_sum_naive(long long n) {
    if (n <= 1)
        return n;

    long long previous = 0;
    long long current  = 1;
    long long sum      = 1;

    for (long long i = 0; i < n - 1; ++i) {
        long long tmp_previous = previous;
        previous = current;
        current = tmp_previous + current;
        sum += current;
    }

    return sum % 10;
}

int main() {
    long long n = 0;
    std::cin >> n;
    std::cout << fibonacci_sum_fast(n);
}
