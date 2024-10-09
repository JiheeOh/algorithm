l = int(input())
listA = list(map(int,input().split()))
m = int(input())

listA.sort()
maxIndex = l-1
minIndex = 0
for _ in range(m):
    listA[maxIndex] -= 1
    listA[minIndex] += 1
    listA.sort()

print(listA[maxIndex]-listA[minIndex])