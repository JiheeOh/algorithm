from collections import deque

subject = input()
n = int(input())
for i in range(n):
    strA = input()
    dq = deque(subject)
    for x in strA:
        if x in dq:
            if x != dq.popleft():
                print("#%d NO" % (i + 1))
                break
    else:
        if len(dq) == 0:
            print("#%d YES" % (i + 1))

        else:
            print("#%d NO" % (i + 1))