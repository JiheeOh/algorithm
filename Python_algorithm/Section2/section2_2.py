# K번째 수 
# 내가 짠거 
# testCase = int(input())
# for i in range(testCase):
    # listCondi= list(map(int,input().split()))
    # listCase = list(map(int,input().split()))
    # answer = sorted(listCase[listCondi[1]-1:listCondi[2]])
    # print(answer[listCondi[3]-1])

testCase = int(input())
for i in range(testCase):
    n,s,e,k= map(int,input().split())
    listCase = list(map(int,input().split()))
    listCase=listCase[s-1:e]
    listCase.sort()
    print("#%d %d" %(i+1,listCase[k-1]))
   

   





