n = list(input())
stack =[]

def remove(i,j,p):
    i = int(i)
    j = int(j)
    res = 0
    if p == "+":
        res = i+j
    elif p == "-":
        res = i-j
    elif p == "*":
       res = i*j
    elif p == "/":
       res = i/j
    return str(res)


for x in n :
    if x.isdecimal():
        stack.append(int(x))
    else :
        n1 = stack.pop()
        n2 = stack.pop()
        if x == "+":
            stack.append(n2+n1)
        elif x == "-":
            stack.append(n2-n1)
        elif x == "*":
            stack.append(n2*n1)
        elif x == "/":
            stack.append(n2/n1)

print(stack[0])

# 352+*9-
