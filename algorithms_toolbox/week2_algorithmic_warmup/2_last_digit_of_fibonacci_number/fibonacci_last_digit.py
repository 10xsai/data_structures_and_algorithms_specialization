# Uses python3
import sys

def get_fibonacci_last_digit(n):
    if n <= 1:
        return n

    previous = 0
    current  = 1
    for i in range(n - 1):
        fibb = previous + current
        previous = current
        current = (fibb) % 10
    return current % 10

if __name__ == '__main__':
    n = int(input())
    print(get_fibonacci_last_digit(n))
