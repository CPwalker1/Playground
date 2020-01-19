n=int(input())
l=[]
for i in range(n):
  l.append(input())
for i in range(len(l)):
  j=i-1
  key=l[i]
  while(j>=0 and key<l[j]):
    l[j+1]=l[j]
    j-=1
  l[j+1]=key
for i in l:
  print(i)
  