# K번째 약수 풀이
n,k = map(int,input().split())

# a = []
# for i in range(1,n+1):
    # if n%i ==0 :
        # a.append(i)
# 
# if k > len(a) : 
    # print (-1) 
# else : 
    # print(a[k-1])

cnt=0

for i in range(1,n+1):
    print(i)
    if n%i == 0:
        cnt+=1
    if cnt ==k:
        print(i)
        break
else:
    print(-1)

