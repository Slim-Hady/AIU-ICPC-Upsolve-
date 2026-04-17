import sys

def solve():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    A = list(map(int, data[1:]))

    max_odd = -1
    max_even = -1

    for val in A:
        if val % 2 == 0:
            if val > max_even:
                max_even = val
        else:
            if val > max_odd:
                max_odd = val

    if max_odd != -1 and max_even != -1:
        print(max_odd + max_even)
    else:
        print(-1)

if __name__ == "__main__":
    solve()
