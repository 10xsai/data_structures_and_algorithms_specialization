# Uses python3
import sys

def get_optimal_value(capacity, weights, values):
    value = 0.

    # write your code here
    ratios = list()
    for i in range(len(values)):
        ratios.append(values[i]/weights[i])
    while capacity > 0:
        if len(ratios) == 0:
            break
        max_ratio = max(ratios)
        max_index = ratios.index(max_ratio)
        max_val = values[max_index]
        max_weight = weights[max_index]

        if max_weight > capacity:
            value += max_val*(capacity/max_weight)
            break

        ratios.remove(max_ratio)
        value += max_val
        capacity -= max_weight
        #print(ratios, "ratio", max_ratio, "max_ratio", max_ratio, "max_weight", max_weight)
    return value


if __name__ == "__main__":
    data = list(map(int, sys.stdin.read().split()))
    n, capacity = data[0:2]
    values = data[2:(2 * n + 2):2]
    weights = data[3:(2 * n + 2):2]
    opt_value = get_optimal_value(capacity, weights, values)
    print("{:.4f}".format(opt_value))
