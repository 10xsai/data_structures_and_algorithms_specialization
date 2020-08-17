# python3
import sys
from collections import deque

def compute_min_refills(distance, tank, stops):
    # write your code here
    stops.append(distance)
    
    count = 0
    prev = 0
    if stops[0]>tank:
        return -1
    tmp_dist = 0
    for i in range(0, len(stops)-1):
        if stops[i+1]-stops[i] > tank:
            return -1
        if stops[i+1]-tmp_dist <= tank:
            continue
        prev = i
        tmp_dist=stops[prev]
        count += 1
        #print("stops", stops, "prev", prev, "count", count)
    return count

if __name__ == '__main__':
    input = sys.stdin.read()
    data = list(map(int, input.split()))
    d = data[0]
    m = data[1]
    n = data[2]
    stops = data[3:]
    print(compute_min_refills(d, m, stops))
