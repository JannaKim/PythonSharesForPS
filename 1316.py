import sys; input = lambda : sys.stdin.readline().rstrip()

n = int(input())

wordList = []
for _ in range(n):
    word = input()
    wordList.append(word)

x = 0
for w in wordList:
    eList = [0] * 26
    flag = False
    for i in range(1, len(w)):
        eList[ord(w[0]) - ord('a')] += 1
        
        x = ord(w[i-1]) - ord('a')
        if w[i-1] != w[i]:
            eList[x] += 1
            if eList[ord(w[i]) - ord('a')] != 0:
                flag = True
            
        else:
            if eList[ord(w[i]) - ord('a')] != 0:
                flag = True
        
        if flag == False:
            continue
        else:
            n -= 1
            break
        
print(n)

#반례