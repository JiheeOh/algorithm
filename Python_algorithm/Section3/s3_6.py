n = int(input())
listA = []*n
for _ in range(n):
    listA.append(list(map(int,input().split())))

resultList = []
rightDiagonal=0
leftDiagonal =0
for i in range(len(listA)):
    row = 0
    col = 0
    rightDiagonal += listA[i][i]
    leftDiagonal += listA[i][n-1-i]
    for j in range(len(listA)):
        row += listA[i][j]
        col += listA[j][i]
    resultList.append(row)
    resultList.append(col)

resultList.append(rightDiagonal)
resultList.append(leftDiagonal)





print(max(resultList))
print(resultList)