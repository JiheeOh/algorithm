# K번째 큰 수 
# n,k =map(int,input().split())
# listA = list(map(int,input().split()))
# result = []
# for i in range(len(listA)-2):
#     for j in range(i+1,len(listA)-1):
#         for q in range(j+1,len(listA)):
#             result.append(listA[i]+listA[j]+listA[q])
# result = list(set(result))
# result.sort(reverse=True)
# print(result[k-1])


# 모범 코드
n, k = map(int, input().split())
listA = list(map(int, input().split()))
res = set()
for i in range(n):
    for j in range(i + 1, n):
        for m in range(j + 1, n):
            print(i, j, m)
            res.add(listA[i] + listA[j] + listA[m])
res = list(res)
res.sort(reverse=True)
print(res[k - 1])
