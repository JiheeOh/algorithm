data = input()
temp= ""
for i in data :
    if 48<= ord(i) <=57:
        temp += i
answer1 = int(temp)
tempList = [0]*answer1
count=0
for i in range(0,answer1//2):
    if answer1%(i+1) ==0:
        other = answer1//(i+1)
        if other!= i and tempList[i] !=1:
            count +=2
            tempList[i] += 1
            tempList[other-1] += 1
        elif other== i and tempList[i] != 1:
            tempList[i] += 1
            count+=1

print(answer1)
print(count)

# 모범 코드
s= input()
res = 0
for x in s :
    if x.isdecimal():
        res = res*10+int(x)
print(res)
cnt =0
for i in range(1,res+1):
    if res%i ==0 :
        cnt+=1
print(cnt)