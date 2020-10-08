# Uses python3
import sys

def get_change(m):
    #write your code here
    coins = [1, 3, 4]
    return count(coins, m)

def count(coins, m):
    arr = [10**8 for i in range(m+1)]
    arr[0] = 0
    for curr in range(1, m+1):
        for i in range(len(coins)):
            if curr >= coins[i]:
                curr_num_coins = arr[curr - coins[i]] + 1
                if curr_num_coins < arr[curr]:
                    arr[curr] = curr_num_coins
#        print(arr)
    return arr[m]

if __name__ == '__main__':
    m = int(sys.stdin.read())
    print(get_change(m))
    