import sys ; input = lambda : sys.stdin.readline().rstrip()

#그전에 풀었던 방식으로 풀면 이중배열로 푸는게 아닌거
#같아서 구글링해봤더니, 예전에 이렇게 먼저
#이중배열만들어주고, 이런식으로 푼적이있었어요.
#이런 검색조차 이제 구글링을하지 말아야겠어요 ㅠㅠ
#뭔가 풀고도 푼거같지 않은 느낌입니다,,,,,ㅜㅜ

# 이런문제 계속 풀어보면서 연습하고 싶습니다!!
#저는 일단 처음 접근은 큰거에서 작은거 빼는걸로 했고
#이중배열은 작은거를 더해서 합쳐가는 식으로 풀었습니다.

n  = int(input())

mylist = [[False] * 101 for _ in range(101)] 

for _ in range(n):
    b, h = map(int, input().split())
    for i in range(b, b + 10):
        for j in range(h, h + 10):
            if(mylist[i][j] == False):
                mylist[i][j] = True
                      
count = 0
for i in mylist:
    for j in i:
        if(j == True):
            count += 1
print(count)
