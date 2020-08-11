# Uses python3
import sys

def gcd(a, b):
    if a % b == 0:
        return b
    return gcd(b, a%b)

def lcm(a, b):
    gcd_value = gcd(a, b)
    return int((a*b)/gcd_value)

if __name__ == '__main__':
    input = sys.stdin.readline()
    a, b = map(int, input.split())
    print(lcm(a, b))

