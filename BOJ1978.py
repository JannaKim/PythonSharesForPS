import sys

x = int(input())
numList = list(map(int, input().split()))
count = 0


for i in numList:
    if i == 1:
        count += 0
    else:
        ans = True
        if i != 2 and i % 2 == 0:
            ans = False
        for j in range(3, i, 2):
            if j * j > i:
                break
            if i % j == 0:
                ans = False
                break
        if ans == True:
            count += 1

print(count)

