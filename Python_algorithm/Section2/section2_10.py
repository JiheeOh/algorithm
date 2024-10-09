n = int(input())
listA = list(map(int,input().split()))

sum = 0
count = 0
for i in range(len(listA)):
    if listA[i] == 1 :
        count+=1
        sum += count
    else :
        count = 0

print(sum)

