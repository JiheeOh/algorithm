# n = int(input())
# listA = []
# for i in range(n):
#     listA.append(list(map(int, input().split())))


# def getPrice(x: list):
#     rule = len(x) - len(set(x))
#     if rule == 0:
#         return max(x) * 100
#     elif rule == 1:
#         for j in range(len(x)):
#             if x.count(x[j]) == 2:
#                 return x[j]*100 + 1000
#     else:
#         return x[0] * 1000 + 10000
#
#
# prices = []
# for i in range(len(listA)):
#     prices.append(getPrice(listA[i]))
#
# print(max(prices))


# 모범 코드
n = int(input())
res = 0
for i in range(n):
    tmp = input().split()
    tmp.sort()
    a, b, c = map(int, tmp)
    if a == b and b == c:
        money = a * 1000 + 10000
    elif a == b or a == c:
        money = a * 100 + 1000
    elif b == c:
        money = b * 100 + 1000
    else:
        money = c * 100
    if money > res :
        res = money
print(res)