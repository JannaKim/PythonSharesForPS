import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())
m = 4 * (n - 1) + 1

paper = [["*"] * m for _ in range(m)]


if n == 1 :
        print("*")
else:     
    x = m - 1
    y = 1
    while(x - y >= 0):
        
        if x % 2 == 0:
            for i in range(y,x):
                for j in range(y,x):
                    paper[i][j] = " "
                    
        else:
            for i in range(y, x):
                for j in range(y,x):
                    paper[i][j] = "*"
        
        y += 1     
        x -= 1      

    for el in paper:
        print(*el, sep='')
        '''
    for i in paper:
        for j in i:
            print(1,2,sep='')
            print(j,end='')
        print()
*********
*        
* *******
* *     *
* * * * *
* * * * *
* * * * *
* *   * *
* ***** *
*       *
*********

        '''
        
            
