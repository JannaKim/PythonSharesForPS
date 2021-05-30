import sys; input = sys.stdin.readline

ti_list = []
for _ in range(9):
    x = int(input())
    ti_list.append(x)

for i in range(7):
    for j in range(i+1, 8):
        for k in range(j+1, 9):
            ans = ti_list[i] + ti_list[j] +ti_list[k]
            if ans == 100:
                break
            print(ans)
