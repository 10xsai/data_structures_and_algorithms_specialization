# Uses python3
def edit_distance(s, t):
    #write your code here
    n1, n2 = len(s), len(t)
    arr = [[None for j in range(n2+1)] for i in range(n1+1)]
    for i in range(n1+1):
        for j in range(n2+1):
            if i==0:
                arr[i][j] = j
            elif j==0:
                arr[i][j] = i
            elif s[i-1]==t[j-1]:
                arr[i][j] = arr[i-1][j-1]
            else:
                arr[i][j] = min((arr[i][j-1]+1, arr[i-1][j]+1, arr[i-1][j-1]+1))
    return arr[n1][n2]

if __name__ == "__main__":
    print(edit_distance(input(), input()))
