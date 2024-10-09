listA = [list(map(int,input().split())) for _ in range(7)]

count = 0

# def isAnswer(x : list):
#     for i in range(2,5):
#         for j in range(1,3):
#             if x[i-j] != x[i+j]:
#                 break
#         else:
#             return True
#

# for i in range(len(listA)):
#     tempList = []
#     if isAnswer(listA[i]):
#         count +=1
#     for j in range(len(listA)):
#         tempList.append(listA[j][i])
#     if isAnswer(tempList):
#         count +=1
#
# print(count)

# 회문수 판단할 기준을 앞자리로 설정 후  가로 행은 slice 개념 사용
# 세로 행은 slice 개념을 사용할 수 없다.
for i in range(3):
    # 가로 행
    for j in range(7):
        tmp = listA[j][i:i+5]
        if tmp == tmp[::-1]:
            count +=1

    # 세로 행
    for k in range(2):
        if listA[i+k][j] != listA[i+5-k-1][j]:
            break
    else :
        count +=1

print(count)
