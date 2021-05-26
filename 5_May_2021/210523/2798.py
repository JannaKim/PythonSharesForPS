import sys; input = sys.stdin.readline
from itertools import combinations

N,M = map(int, input().split())

numberList = list(map(int, input().split()))

mylist = combinations(numberList, 3)
sumList = []
for i in mylist:
    a = sum(i)
    sumList.append(a)

sumList = set(sumList)
sumList2 = list(sumList)
sumList2 = sorted(sumList2)


for i in range(len(sumList2)):
    if(sumList2[-1] < M):
        print(sumList2[-1])
        break
    if (int(sumList2[i]) > M):
        print(sumList2[i-1])
        break   
