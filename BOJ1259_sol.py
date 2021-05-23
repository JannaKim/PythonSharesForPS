import sys; lambda : sys.stdin.readline().rstrip()

while(True):
    x = input()
    y = x[::-1]
    if(int(x) == 0):
        break
    if(x == y):
        print("yes")
    else:
        print("no")