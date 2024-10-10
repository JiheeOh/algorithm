# 구간 내 최솟값 구하기
import sys
input = sys.stdin.readline

n,m = map(int,input().split())
data = [int(input()) for _ in range(n)]

tree = [0 for _ in range(n*4)]

def initTree (start,end,x):
    # 리프 노드
    if start == end :
        tree[x] = data[start]
        return tree[x]

    mid = (start + end) //2
    leftValue = initTree(start,mid,x*2)
    rightValue = initTree(mid+1,end, x*2+1)
    tree[x] = min(leftValue,rightValue)
    return tree[x]

def findTree(a,b,start,end,x) :
    # 구간 밖일 경우
    if a>end or b< start:
        return sys.maxsize

    if a<=start and end <=b :
        return tree[x]

    mid = (start+end) //2
    leftValue = findTree(a,b,start,mid,x*2)
    rightValue = findTree(a,b,mid+1,end,x*2+1)
    return min(leftValue,rightValue)

initTree(0,n-1,1)

for _ in range(m):
    a,b = map(int,input().split())
    print(findTree(a-1,b-1,0,n-1,1))