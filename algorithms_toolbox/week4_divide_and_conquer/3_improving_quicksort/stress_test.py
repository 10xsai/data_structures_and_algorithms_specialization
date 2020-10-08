from sorting import randomized_quick_sort, randomized_quick_sort2
import random

n = 100000

arr = list()
while n>0:
    arr.append(random.randint(1, 10**1))
    n-=1

print(randomized_quick_sort2(arr, 0, len(arr)-1))