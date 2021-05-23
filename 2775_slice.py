import sys; input = lambda : sys.stdin.readline().rstrip()

T = int(input())
for i in range(T):
    k = int(input())
    n = int(input())
    mylist = [[0] * (n+1) for i in range(k+1)]
    
    for j in range(k+1):
        for z in range(n+1):
            mylist[0][z] = z+1
            mylist[j][0] = 1
            mylist[j][z] = sum(mylist[j-1][0:z+1])
    print(mylist[k][n-1])