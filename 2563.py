import sys; input = lambda : sys.stdin.readline().rstrip()

#이차원배열을 연습한다는 생각을 갖고

#일단 이 문제는 n의 개수만큼 100 * n을 해주고
#겹치는 부분을 거기서 빼주는 식으로 풀면 될거같다.

n = int(input())

sq = []
for _ in range(n):
    x = list(map(int,input().split()))
    sq.append(x)

sq = sorted(sq, key=lambda y : y[0])

for i in range(len(sq)):
    sq.append([sq[i][0] + 10, sq[i][1] + 10])

#이런식으로 하면 구현이 어려움




