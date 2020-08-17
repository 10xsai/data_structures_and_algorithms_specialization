
def max_pairwise_product(num):
    n = len(num)
    index1 = 0
    for i in range(1,n):
        if num[i]>num[index1]:
            index1 = i
    if index1 == 0:
        index2 = 1
    else:
        index2 = 0
        for j in range(n):
            if num[j]!=num[index1] and num[j]>num[index2]:
                index2 = j
    return num[index1]*num[index2]


if __name__ == '__main__':
    input_n = int(input())
    input_numbers = [int(x) for x in input().split()]
    print(max_pairwise_product(input_numbers))
    print(max_pairwise_fast(input_numbers))
