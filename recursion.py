def f(x,cnt):
    # print(f'f({x}) 실행')
    # 종료조건
    if not x:
        #print(0)
        return
    print(' '*cnt,x)
    #for i in range(x):
    a = x
    a += f(x-1 , cnt+1 )
    #print(1,2)
    return a
    print(' '*cnt,x)


def g(x,cnt):
    #print(f'f({x}) 실행')
    # 종료조건
    if not x:
        print(f'{x}를 리턴')
        return x
    print(' '*cnt,x)
    print(f'g({x-1},{cnt+1}) 를 리턴')
    g(x-1,cnt+1)
    #print(' '*cnt,x)

'''
def func(a,b):
    c = a+b
    #print(c)
    return c
    
func(3,4)

print(f())
f()
f(n)
'''

print(f(6,0))