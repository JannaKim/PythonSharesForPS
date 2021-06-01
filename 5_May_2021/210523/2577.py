import sys; input = lambda: sys.stdin.readline().rstrip()

A = int(input())
B = int(input())
C = int(input())

ans = A * B * C

ans = str(ans)

L = [0] * 10

for i in ans:
    L[int(i)] += 1
    
print(*L, sep="\n")