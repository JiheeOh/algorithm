n = int(input())
listA = list(map(int,input().split()))
m = int(input())
listB = list(map(int,input().split()))

# listA.extend(listB)
# listA.sort()
# print(listA)

i = 0
j = 0
listC = []*(n+m)
while i < n and j < m:
    if listA[i] < listB[j]:
        listC.append(listA[i])
        i += 1
    else :
        listC.append(listB[j])
        j += 1

if i >= n :
    listC.extend(listB[j:])
    #c = c+listB[j:]
else :
    listC.extend(listA[i:])
    # c = c+listA[i:]


for x in listC:
	print(x, end=' ')