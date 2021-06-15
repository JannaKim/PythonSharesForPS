paper = [[' '] * 256 for _ in range(256)]

'''
for i in range(31):
    for j in range(31):
        if abs(x - i) + abs(y - j) ==15:
            paper[j][i] = 1
print(*paper, sep="\n")

     '''       


def fun(y , x ,side, sw):
    #my , mx = y + 

    if side <=1:
        return
    for i in range(side):
        for j in range(side):
            #if abs(x - i) + abs(y - j) ==k:
            if sw:
                paper[j][i] = 1
            else:
                paper[j][i] = 0
    
    #print(*paper, sep="\n")
    fun(y//2 , x//2 , side//2, not sw)
    fun(y//2 , x//2 , side//2, not sw)
    #fun(y//2 , x//2 + k, k//2)

    [print(*el) for el in paper]


fun(0, 0,256,True)
'''
for i in range(15 , -1, -2):
    fun(i)
'''    


