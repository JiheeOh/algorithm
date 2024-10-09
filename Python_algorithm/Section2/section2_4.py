# # 대표값
# from statistics import mean
#
# n = int(input())
# scores = list(map(int, input().split()))
#
# # 평균값
# averageScore = round(mean(scores))
#
# answerValue = scores[0]
# for i in range(1, len(scores)):
#     if abs(scores[i] - averageScore) < abs(answerValue - averageScore):
#         answerValue = scores[i]
#     if abs(scores[i] - averageScore) == abs(answerValue - averageScore):
#         answerValue = max(answerValue, scores[i])
#
# answer = scores.index(answerValue)
# print(averageScore,answer+1, end="")


# 모범 코드
n = int(input())
scores = list(map(int, input().split()))

# round 함수 = round half even 방식을 택한다.
# a= 4.5000 : 정확하게 4.5000이면 짝수로 맞춰주려고 4로 만들어버린다.
# averageScore = round(sum(scores)/n)
averageScore = int(sum(scores)/n + 0.5)

# 정수형의 최대값
min = 2147000000
for idx,value in enumerate(scores):
    tmp = abs(value-averageScore)
    if tmp < min:
        min = tmp
        answerScore = value
        answerIdx = idx+1
    elif tmp == min:
        if value > answerScore:
            answerScore = value
            answerIdx = idx+1

print(averageScore,answerIdx)