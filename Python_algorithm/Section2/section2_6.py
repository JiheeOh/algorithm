# # 자릿수의 합
# n = int(input())
# m = list(map(int, input().split()))
#
#
# def digit_sum(x):
#     result = 0
#     x = list(str(x))
#     for j in range(len(x)):
#         result += int(x[j])
#     return result
#
#
# maxSum = 0
# for i in range(n):
#     if digit_sum(m[i]) > digit_sum(maxSum):
#         maxSum = m[i]
#
# print(maxSum)

# 모범 코드
n = int(input())
m = list(map(int, input().split()))


# def digit_sum(x):
#     result = 0
#     while x > 0:
#         sum += x % 10
#         x = x // 10
#     return result

def digit_sum(x):
    result = 0
    for i in str(x):
        result += int(i)
    return result



max = -2147000000
for x in m:
    tot = digit_sum(x)
    if tot > max:
        max = tot
        res = x
print(res)
