n,m = map(int,input().split())
listA = []

for i in range(n):
    listA.append(int(input()))

listA.sort()
start = 1
end = listA[n-1]

def getCount(x : int):
    answer = 0
    for i in range(n):
        answer += (listA[i] // x)
    return answer

res = 0
while start <= end :
    middle = (start+end) //2
    count = getCount(middle)
    if count >= m :
        res = middle
        start = middle+1
    elif count < m :
        end = middle-1



print(res)

