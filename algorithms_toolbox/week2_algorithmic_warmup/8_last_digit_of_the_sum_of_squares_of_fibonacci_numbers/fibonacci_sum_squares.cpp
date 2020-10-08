#include <iostream>
#define ll long long

ll get_fibonacci_last_digit(ll n) {
	ll temp, curr = 1, prev = 0;
	while (n--) {
			temp = curr+prev;
			prev = curr;
			curr = temp%10;
	}
	return (prev*curr)%10;
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

int fibonacci_sum_squares_fast(ll n) {
	if (n<=1){
		return n;
	}
	int temp,curr = 1,prev = 0;
	while (n--) {
		temp=curr+prev;
		prev=curr;
		curr=temp%10;
	}
	return prev*curr%10;
}

int fibonacci_sum_squares_fast_optimized(long long n) {
    if (n <= 1)
        return n;
    return  get_fibonacci_last_digit(n%get_pisano_period(10));
}

int main() {
    long long n = 0;
    std::cin >> n;
    std::cout << fibonacci_sum_squares_fast_optimized(n);
}
