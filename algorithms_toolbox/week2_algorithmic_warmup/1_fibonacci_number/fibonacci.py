# Uses python3
def calc_fib(n):
    if (n <= 1):
        return n
    prev = 0
    curr = 1    
    for i in range(n-1):
        fibb = prev + curr
        prev = curr
        curr = fibb
    return fibb

n = int(input())
print(calc_fib(n))