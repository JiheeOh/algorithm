from collections import deque

n,m =map(int,input().split())
weight = list(map(int,input().split()))

weight.sort()
# deque 자료 구조 생성
weight =deque(weight)
count = 0

while weight :
    # 한명만 남았을경우
    if len(weight) ==1:
        count+=1
        break
    if weight[0]+weight[-1] >m:
        weight.pop()
        count+=1
    else :
        # 맨 앞 요소 삭제
        weight.popleft()
        # 맨 뒤 요소 삭제
        weight.pop()
        count+=1

print(count)