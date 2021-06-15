import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())

x, y = n - 1, n - 1

paper = [[' '] * (2*n-1) for _ in range(2*n-1)]

#[print (*el) for el in paper]

for i in range(2 * n - 1):
    for j in range(2 * n -1):
        if abs(x - i) + abs(y - j) < n:
            paper[j][i] = '*'

for i in range(n, 2 * n -1):
    for j in range( 2 * n - 1):
        if abs(x - i) + abs(y - j) >= n:
            paper[j][i] = ''


for el in paper:
    print(*el, sep='')