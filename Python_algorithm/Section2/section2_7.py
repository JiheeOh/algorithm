n = int(input())

# 완전 오래 걸림
# answer = []
# for i in range(2, n + 1):
#     for j in range(2, i):
#         if i % j == 0 and i != j:
#             break
#     else:
#         answer.append(i)
#
# print(len(answer))

# 에라토스테네스 체
listA = [0] * n
cnt = 0
for i in range(2, n + 1):
    if listA[i-1] == 0:
        cnt += 1
        for j in range(i, n + 1, ++i):
            listA[j-1] = 1

print(cnt)