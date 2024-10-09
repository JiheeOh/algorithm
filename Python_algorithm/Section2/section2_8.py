# 뒤집은 소수
n = int(input())
listA = list(map(int, input().split()))


# 뒤집기
def reverse(x):
    temp = ""
    while x > 0:
        temp += str(x % 10)
        x = x // 10
    return int(temp)


# 소수인지 판단
def isPrime(x):
    if x == 1:
        return False
    # 반까지 나눠지는 게 있으면 무조건 false 출력
    for i in range(2, x // 2 + 1):
        if x % i == 0:
            return False
    else:
        return True


for i in listA:
    check = reverse(i)
    if isPrime(check):
        print(check, end=" ")
