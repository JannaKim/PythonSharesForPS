T = int(input())

mylist = []

for _ in range(T):
    s = list(map(int,input().split()))
    mylist.append(s)

for el in mylist:
    x = 0
    sum1 = sum(el) - el[0]
    avg = sum1 / el[0]
    
    for e in el[1:]:
        if avg < e:
            x += 1
    answer = x / el[0] * 100 
    print(f"{answer:0.3f}%")

