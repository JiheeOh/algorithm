# 구간 합 구하기
n,m,k = int(input().split())

# n = 수의 개수 , m = 수의 변경이 일어나는 횟수 , k = 구간의 합을 구하는 횟수

# 입력값으로 배열을 만들자
data = []*n
for i in range(n) :
    data.append(input())