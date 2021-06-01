import sys; input = lambda : sys.stdin.readline().rstrip()

L = [0] * 26

S = input()

for i in S:
    x = ord(i) - 97
    L[x] += 1
print(*L)