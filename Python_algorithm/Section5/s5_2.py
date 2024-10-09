inputList = list(input())
stack = []
res = 0
for i in range(len(inputList)):
    if inputList[i] == "(": #  ( 일 경우 stack에 쌓음
        stack.append(inputList[i])
    else : # ) 일 경우 stack에 안쌓음
        stack.pop()
        if inputList[i-1] == "(": # 앞에가 ( 일 경우 레이저로 판정
            res += len(stack)

        else : # 줄 끝난 것으로 판정
           res +=1


print(res)


# ()(((()())(())()))(())