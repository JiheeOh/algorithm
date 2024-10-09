n,m = map(int,input().split())
listA= list(map(int,input().split()))

start = max(listA)
end = sum(listA)

answer = 0

def isAnswer(x :int):
    count = 1
    sum = 0

    for i in range(n) :
        if sum + listA[i] > x :
            count+=1
            sum = listA[i]
        else :
            sum += listA[i]

    return count

time = 0

while start <= end :
    middle = (start+end) //2
    res = isAnswer(middle)
    if res > m :
       start = middle +1
    elif res <= m :
        end= middle -1
        time = middle

print (time)
