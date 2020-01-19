s=int(input())
l=[]
for i in range(s):
  l.append(int(input()))
e=int(input())
if(e not in l):
  print("Element is not found")
else:
  s1=l.index(e)
  print(str(e)+" is present at location "+str(s1))
       
  