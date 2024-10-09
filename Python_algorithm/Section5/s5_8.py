n =int(input())
p = dict()
for _ in range (n):
    word =input()
    p[word] =1

for _ in range (n-1):
    a = input()
    p[a] = 0

for key,val in p.items():
    if val == 1 :
        print(key)
        break


# 5
# big
# good
# sky
# blue
# mouse
# sky
# good
# mouse
# big

# blue
