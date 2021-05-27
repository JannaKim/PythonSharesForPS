import sys; input = sys.stdin.readline
from itertools import combinations as combi

ti_list = []

for _ in range(9):
    x = int(input())
    ti_list.append(x)

ti_list = combi(ti_list, 7)


for el in ti_list:
    total = sum(el)
    if total == 100:
        break

for i in el:
    print(i)

