#Knowledge about the formula for half way point
n = 6
for c in range(1,n/2+1):
	for i in range(c,n-c+2):
		print(i)

#With no knowledge of half way point
a = 6
b = 1
while b<a:
	for i in range(b,a+1):
		print(i)
	a-=1
	b+=1 
