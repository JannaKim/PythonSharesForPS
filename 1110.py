import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())
cnt = 0
ans = n

while True: 
    num1 = ans // 10
    num2 = ans % 10
    num3 = (num1 + num2) % 10
    
    ans = num2 * 10 + num3
    cnt += 1

    if ans == n:
        break

print(cnt)