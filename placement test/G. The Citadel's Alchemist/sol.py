import sys

def solve():
    # Reading all input for speed
    input_data = sys.stdin.read().split()
    if not input_data:
        return
    
    n = int(input_data[0])
    v = list(map(int, input_data[1:]))
    
    # Step 1: Count how many numbers are multiples of 5
    cnt = 0
    for x in v:
        if x % 5 == 0:
            cnt += 1
            
    # Step 2: See how many 15s we can form using the available 5s
    ans = 0
    for x in v:
        if (x * 5) % 15 == 0:
            if cnt > 0:
                ans += 1
                cnt -= 1
        if cnt == 0:
            break
            
    print(ans)

if __name__ == "__main__":
    solve()
