n = int(input())
listA = []
for i in range(n):
	listA.append(input().upper())

def opposite(x:str):
	result = ""
	for i in reversed(range(len(x))) :
		result += x[i]
	return result

for j in range(len(listA)):
	if listA[j] == opposite(listA[j]):
		result = "YES"
	else :
		result = "NO"

	print("%d %s" %(j+1,result))