import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())
paper = [[1] * (2 * n -1) for _ in range(2 * n -1)]

dir = [
    [1,0],
    [-1,0],
    [0,-1],
    [0,1],
    [1,-1],
    [1,1],
    [-1,-1],
]

a = 0
for i in range(1, n):
    for j in range(1, n):
        for b,c in dir:
            new_x, new_y = paper[i][j] + b, paper[i][j] + c
            a = abs(paper[new_x][new_y])
            print(a)
       
#우선 저는 다 1로 초기화를해주고 합이 <= 4 인것들은
#"*"로 바꿔줘서풀고싶습니다...
#이거 찍다가 for문 찍기를 못하는거같아서 원래 풀던 for문으로 한번 풀어봤습니다
#다시 맨하튼 방식으로 풀어볼게요!!!