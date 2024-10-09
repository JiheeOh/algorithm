n = int(input())
listA = [list(map(int,input().split()))for _ in range(n)]
# 상하좌우 좌표 설정
dx = [-1,0,1,0]
dy = [0,1,0,-1]

# 가장자리를 0으로 초기화
listA.insert(0,[0]*n)
listA.append([0]*n)
for i in listA :
    i.insert(0,0)
    i.append(0)

count= 0
for i in range(1, n+1):
    for j in range(1, n+1):
        # 조건이 모두 참일때
        if all(listA[i][j]>listA[i+dx[k]][j+dy[k]] for k in range(4)) :
            count +=1

print(count)