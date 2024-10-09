n = int(input())
meeting = []
for i in range(n):
    s,e = map(int,input().split())
    # 튜플 생성
    meeting.append((s,e))
# 튜플 뒤에 것을 기준으로 정렬하고 그 다음 첫번째거로 정렬
meeting.sort(key=lambda x: (x[1],x[0]))

end = 0
count =0
for s,e in meeting:
    if s >= end :
        end = e
        count+=1

print(count)