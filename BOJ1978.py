import sys; input= lambda: sys.stdin.readline().rstrip() # 인풋빨리 받는법

x = int(input())
numList = [*map(int, input().split())] #
count = 0


for i in numList: # 이터레이터 변수 i로 ㄴㄴ. i는 for i in range(~)에서만. i,j 는 idx 용임
    if i == 1:
        count += 0
    else:
        ans = True
        if i != 2 and i % 2 == 0:
            ans = False
        for j in range(3, i, 2): # 루트 i쓰는 법: i**(0.5). range(3, i**(0.5)+1, 2) 쓰면 더 좋겠죠
            if j * j > i:
                break
            if i % j == 0:
                ans = False
                break
        if ans == True: # 이거 C, java 식. 파이썬은 그냥 if ans: 로
            count += 1

print(count)

