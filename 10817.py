import sys; input = lambda : sys.stdin.readline().rstrip()

mylist = [ x for x in map(int, input().split())]

mylist  = sorted(mylist, reverse= False)
print(mylist[1])