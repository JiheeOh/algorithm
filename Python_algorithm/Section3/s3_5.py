n,m = map(int,input().split())
listA = list(map(int,input().split()))

startPoint= 0
endPoint = 1
count = listA[0]
result = 0

while True:
    if count < m :
        if endPoint < n :
            count += listA[endPoint]
            endPoint +=1
        else :
            break

    elif count == m :
        result+=1
        count -= listA[startPoint]
        startPoint +=1

    else :
        count -= listA[startPoint]
        startPoint +=1


print(result)