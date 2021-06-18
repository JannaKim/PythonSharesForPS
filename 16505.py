import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())
k = 2 ** n

paper = [[''] * k for _ in range(k)]

for i in range(k):
    for j in range(k):
        if(j == k - i):
            break
        else:
            paper[i][j] = ' '



def func_a(x, y, w):
    if(w == 1):
        paper[x][y] = '*'
        return
    newk = w // 2
    func_a(x, y, newk)
    func_a(x, y + newk, newk)
    func_a(x + newk, y, newk)

func_a(0,0,k)

for el in paper:
    print(*el, sep='')

#삼각형을 만들어서 재귀돌리는 방법을 알고싶습니당... ㅜ 