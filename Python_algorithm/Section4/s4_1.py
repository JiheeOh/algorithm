n,m = map(int,input().split())
listA = list(map(int,input().split()))
listA.sort()

start = 0
end = n-1

while start<=end :
    middle = (start + end) // 2
    if m < listA[middle] :
        end = middle-1
    elif m > listA[middle]:
        start = middle+1
    else :
        print(middle+1)
        break

