# 오 저 ceil 함수 안쓰는데 저도 쓰면 좋겠네요 ㅋㅋㅋ 감사여
import sys; input = sys.stdin.readline
from itertools import combinations as combi # 전 이렇게 축약해요

N,M = map(int, input().split())

numberList = [*map(int, input().split())]

mylist = combi(numberList, 3)
sumList = []
for el in mylist:
    a = sum(el)
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
