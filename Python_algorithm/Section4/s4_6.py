n = int(input())
spec =[]
for i in range(n):
    k,w = map(int,input().split())
    spec.append((k,w))

spec.sort(reverse=True)


largest = 0
cnt = 0

for x,y in spec :
    if y> largest:
        largest = y
        cnt+=1

print(cnt)