import sys; input = lambda : sys.stdin.readline().rstrip()

a = int(input())
b = int(input())
c = int(input())

cnt = [0] * 10

x = a*b*c

x = str(x)

for i in x:
    cnt[int(i)] += 1

print(*cnt, sep = '\n')
