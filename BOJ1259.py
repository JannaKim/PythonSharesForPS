import sys
input = sys.stdin.readline

while(True):
    x = input()
    if int(x[0]) == 0:
        break
    y = ''
    for i in range(len(x)):
        y += x[len(x) - i -1]
    if(int(y) == int(x)):
        print("yes")
    else:
        print("no")