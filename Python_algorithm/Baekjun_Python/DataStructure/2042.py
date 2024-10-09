# 구간 합 구하기 -> 배열 : 시간초과
n,m,k = map(int,input().split())

# n = 수의 개수 , m = 수의 변경이 일어나는 횟수 , k = 구간의 합을 구하는 횟수

# 입력값으로 배열 만들기
data = []*n
for i in range(n) :
    data.append(int(input()))

# 배열의 변경
for j in range(m+k):
    a,b,c = map(int,input().split())
    if a == 1 :
        data[b-1] = c
    elif a == 2 :
        print(sum(data[b-1:c]))