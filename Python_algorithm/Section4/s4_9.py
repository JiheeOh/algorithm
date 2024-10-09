n = int(input())
listA = list(map(int,input().split()))

lt = 0
rt = n-1
last = 0
res = ""
tmp = []
while lt <=rt :
      if listA[lt]>last:
            tmp.append((listA[lt],'L'))
      if listA[rt] > last :
            tmp.append((listA[rt],'R'))
      # 튜플 정렬
      tmp.sort()
      if len(tmp) == 0:
            break
      else :
            res = res+tmp[0][1]
            last = tmp[0][0]
            # 포인터 이동
            if tmp[0][1] == 'L':
                  lt +=1
            else :
                  rt -=1
      tmp.clear()

print(len(res))
print(res)