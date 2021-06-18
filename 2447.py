import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())

def recursion(n, cnt):
    if not n:
        return
    print("***" * cnt * 3)
    print("* *" * cnt * 3)
    print("***" * cnt * 3)

    recursion(n - 1, cnt + 3)

    
    print
    print("***" * cnt)
    print("* *" * cnt)
    print("***" * cnt)

recursion(n, 0)
