import sys
input = sys.stdin.readline

# 구간 합 구하기 -> 배열 : 시간초과 , 구간트리 사용
n,m,k = map(int,input().split())
data = [ int(input()) for _ in range(n)]
# n = 수의 개수 , m = 수의 변경이 일어나는 횟수 , k = 구간의 합을 구하는 횟수

# 구간트리 할당
tree = [0 for _ in range(4*n)]

# tree 만들기
def initTree(x, left, right):
    # 리프 노드
    if left == right :
        tree[x] = data[left]
        return tree[x]

    mid = (left + right)//2
    leftValue = initTree(2 * x, left, mid)
    rightValue = initTree(2 * x+1, mid + 1, right)
    tree[x] = leftValue + rightValue
    return tree[x]

# tree 값 찾기
def findTree(b, c, x, left, right):
    # 구간 밖에 있는 경우
    if b > right or c < left :
        return 0

    elif b <= left and c >= right :
        return tree[x]

    mid = (left+ right) //2
    leftValue = findTree(b, c, x * 2, left, mid)
    rightValue = findTree(b, c, x * 2 + 1, mid + 1, right)
    return leftValue+rightValue


def updateTree(x,left,right,b,c):
    # 구간 밖에 있는 경우
    if b < left or right < b :
        return

    # 리프노드
    if left ==right== b :
        tree[x] = c
        return

    mid = (left+right)//2
    updateTree(x*2,left,mid,b,c)
    updateTree(x*2+1,mid+1,right,b,c)
    tree[x] = tree[x*2] + tree[x*2+1]

initTree(1,0,n-1)

for _ in range(m+k):
    a,b,c = map(int,input().split())
    if a==1 :
        updateTree(1,0,n-1,b-1,c)
    elif a ==2:
        print(findTree(b-1,c-1,1,0,n-1))



