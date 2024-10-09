# 자기 앞에 자기보다 작은 숫자가 있으면 지우고 앞으로 간다
num,m = map(int,input().split())
num =list(map(int,str(num)))
stack = []
for x in num :
    while stack and m > 0 and stack[-1] < x :
        stack.pop()
        m -= 1
    stack.append(x)

if m !=0 :
    stack = stack[:-m]

res = ''.join(map(str,stack))
print(res)