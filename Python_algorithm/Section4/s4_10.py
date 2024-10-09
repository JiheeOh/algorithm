n = int(input())
listA = list(map(int,input().split()))
seq = [0]*n
for i in range(n):
    for j in range(n):
        if listA[i] == 0 and seq[j] ==0 :
            seq[j] = i+1
            break;
        elif seq[j] == 0 :
            listA[i] -=1

for x in seq :
    print(x,end = ' ')

# result=[0]*n
# # 자리 확인용 리스트 생성
# listB = []
# for i in range(n):
#     listB.append(str(i))
#
#
# for j in range(n):
#     index = int(listB[listA[j]])
#     result[index] = j+1
#     listB.remove(str(index))
#
# for k in range(n):
#     print(result[k],end=' ')


