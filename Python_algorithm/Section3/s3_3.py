cardList = list(range(1,21))

for i in range(10):
    a,b = map(int,input().split())
    for j in range((b-a+1)//2):
        cardList[a-1+j],cardList[b-1-j] = cardList[b-1-j],cardList[a-1+j]
for x in a :
    print(a,end=' ')

a= list(range(21))
for _ in range(10):
    s,e = map(int, input().split())
    for i in range((e-s+1)//2):
        a[s+i],a[e-i] = a[e-i],a[s+i]

a.pop(0)
for x in a :
    print(x,end=' ')
