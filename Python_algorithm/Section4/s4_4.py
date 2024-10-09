n,c = map(int,input().split())
listA = []
for i in range(n):
    listA.append(int(input()))

listA.sort()


start = 1
end = max(listA)-min(listA)

def isAnswer(l:int):
    count = 1
    point = listA[0]
    for i in range(1,n):
     if listA[i]- point >=l:
        count+=1
        point = listA[i]

    return count

answer = 1
while start <=end :
    middle = (start +end)//2
    res = isAnswer(middle)
    if res >= c :
        answer = middle
        start = middle +1
    else :
        end = middle -1

print(answer)