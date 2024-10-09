# listA = [list(map(int,input().split()))for _ in range(9)]
#
# result = "YES"
#
# # 가로
# for i in range(len(listA)):
#     tmpList= []
#     for j in range(len(listA)):
#         # 가로
#         if tmpList.count(listA[i][j]) >= 1:
#             result = "NO"
#             break
#         else :
#             tmpList.append(listA[i][j])
#     if not result :
#         break
#
# # 세로
# if result == "YES" :
#     for j in range(len(listA)):
#         tmpList = []
#         for i in range(len(listA)):
#             # 세로
#             if tmpList.count(listA[i][j]) >= 1:
#                 result = "NO"
#                 break
#             else :
#                 tmpList.append(listA[i][j])
#         if result != "YES" :
#             break
#
#
#  # 3*3
# dx = [0, 0, 1, 1, 1, 2, 2, 2]
# dy = [1, 2, 0, 1, 2, 0, 1, 2]
# if result == "YES" :
#     for i in range(0,len(listA),3):
#         for j in range(0,len(listA),3):
#           tempList = [listA[i][j]]
#           for k in range(8):
#               a = listA[i + dx[k]][j + dy[k]]
#               x = i+dx[k]
#               y = j + dy[k]
#               if tempList.count(listA[i+dx[k]][j+dy[k]]) >= 1:
#                   result = "NO"
#                   break
#               else :
#                   tempList.append(listA[i+dx[k]][j+dy[k]])
#
#           if result =="NO":
#               break
#         if result =="NO" :
#             break
#
#
# print(result)

# 행체크, 열 체크, 그룹 체크를 할 list 를 3개 생성
# 값을 체크 list의 인덱스로 사용

def check (a :list):
    for i in range(9):
        ch1 = [0]*10
        ch2 = [0]*10
        for j in range(9):
            ch1[a[i][j]] =1
            ch2[a[j][i]]=1
        if sum(ch1)!=9 or sum(ch2)!=9:
            return False

    for i in range(3):
        for j in range(3) :
            ch3 = [0]*10
            for k in range(3):
                for s in range(3):
                    ch3[a[i*3+k][j*3+s]]=1
                if sum(ch3) !=9 :
                    return False
    return True


a= [list(map(int,input().split())) for _ in range(9)]
if check(a):
    print("YES")
else :
    print("NO")
