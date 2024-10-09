from collections import deque

n,k = map(int,input().split())
listA = list(range(1,n+1))
listA = deque(listA)

while listA :
    for _ in range(k-1):
        ## 제거해야하는 사람 이전 사람은 다시 뒤로 보내준다.
        cur = listA.popleft()
        listA.append(cur)
    listA.popleft()
    if len(listA)==1:
        print(listA[0])
        listA.popleft()



# 8 3 -> 7
