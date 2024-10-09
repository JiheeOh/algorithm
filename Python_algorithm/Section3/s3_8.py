n = int(input())
listA = [list(map(int, input().split())) for _ in range(n)]
m = int(input())

for i in range(m):
    start, direction, end = map(int, input().split())
    if direction == 0:
        for _ in range(end):
            # pop 하면 index에 해당하는 값이 빠지고 나머지 애들이 앞당겨진다.
            listA[start-1].append(listA[start - 1].pop(0))

    else:
        for _ in range(end):
            # insert = 맨 앞 index에 입력
            # pop() :default 맨 뒤 인덱스 pop
            listA[start - 1].insert(0, listA[start - 1].pop())

res = 0
s =0
e =n-1
for i in range(n):
    for j in range(s,e+1):
        res+=listA[i][j]
    if i < n//2:
        s+=1
        e-=1
    else :
        s -=1
        e +=1

print(res)