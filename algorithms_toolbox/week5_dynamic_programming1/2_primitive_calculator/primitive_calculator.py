# Uses python3
import sys

def optimal_sequence(n):
    if n==1:
        return [1]
    steps = compute_steps(n)
    return compute_sequence(n, steps)

def compute_steps(n):
    steps = [10**8 for _ in range(n+1)]
    steps[0], steps[1] = 0, 0
    for curr in range(2, n+1):
        s1 = steps[curr-1] + 1
        s2, s3 = 10**8, 10**8
        if curr%2==0:
            s2 = steps[curr//2] + 1
        if curr%3==0:
            s3 = steps[curr//3] + 1
        min_s = min((s1, s2, s3))
        steps[curr] = min_s
    return steps

def compute_sequence(n, steps):
    sequence = list()
    while n > 0:
        sequence.append(n)
        if n%2!=0 and n%3!=0:
            n-=1
        elif n%2==0 and n%3==0:
            n//=3
        elif n%2==0:
            if steps[n-1] < steps[n//2]:
                n-=1
            else:
                n//=2
        elif n%3==0:
            if steps[n-1] < steps[n//3]:
                n-=1
            else:
                n//=3
    return reversed(sequence)
        

def naive_sequence(n):
    sequence = []
    while n >= 1:
        sequence.append(n)
        if n % 3 == 0:
            n = n // 3
        elif n % 2 == 0:
            n = n // 2
        else:
            n = n - 1
    return reversed(sequence)

input = sys.stdin.read()
n = int(input)
sequence = list(optimal_sequence(n))
print(len(sequence) - 1)
for x in sequence:
    print(x, end=' ')
