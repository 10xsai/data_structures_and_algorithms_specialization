# Uses python3
import sys

def get_change(m):
    coins = [1, 5, 10]
    num_coins = 0
    #write your code here
    for coin in coins[::-1]:
        num_coins += int(m / coin)
        m %= coin
    return num_coins

if __name__ == '__main__':
    m = int(sys.stdin.readline())
    print(get_change(m))
