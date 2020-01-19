#Type your code here...
l=[]
while(True):
  ch=int(input())
  if ch==1:
    l.append(input())
  elif ch==2:
    l.pop(0)
  elif ch==3:
    l.pop(len(l)-1)
  elif ch==4:
    e=input()
    if e not in l:
      print("Element not found")
    else:
      l.remove(e)
  elif ch==5:
    print(' -> '.join(l)+" -> NULL")
  elif ch==6:
    break