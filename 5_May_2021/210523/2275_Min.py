import sys; input = lambda : sys.stdin.readline().rstrip()

T = int(input())
for _ in range(T): # 언더바 _ 는 인덱스 안쓰고 포문만 돌린다는 표시로 많이써요
    k = int(input())
    n = int(input())
    mylist = [[0] * (n+1) for _ in range(k+1)] # 여기도 언더바
    
    for j in range(k+1): # 그럼 여기 i,j 이용 가능
        for z in range(n+1):
            mylist[0][z] = z+1
            mylist[j][0] = 1
            mylist[j][z] = sum(mylist[j-1][0:z+1]) # [:z+1]
    print(mylist[k][n-1])