# 정다면체
n, m = map(int, input().split())

addList = []
countList = [0] * (n * m)
for i in range(1, n + 1):
    for j in range(1, m + 1):
        countList[i + j] += 1

for k in range(len(countList)):
    if countList[k] == max(countList):
        print(k, end=' ')
