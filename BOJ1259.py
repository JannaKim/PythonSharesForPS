import sys
input = sys.stdin.readline

while(True): # while True:
    x = input()
    if int(x[0]) == 0: # if x=='0'
        break
    y = ''
    for i in range(len(x)): # 이렇게 뒤집어도 되지만 x[::-1] 하면 한방임. 파이썬만됨
        y += x[len(x) - i -1]
    if(int(y) == int(x)): # 숫자로 바꾸는 수고까진 필요 없을 것 같아요... >_<
        print("yes")
    else:
        print("no")