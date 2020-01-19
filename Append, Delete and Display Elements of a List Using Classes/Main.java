class Ele:
  def __init__(self):
    self.l=[]
  def append(self,ele):
    self.l.append(ele)
    print(" List:  "+str(self.l))
  def delete(self,ele):
    self.l.remove(ele)
    print(" List:  "+str(self.l))
  def display(self):
    print("List:  "+str(self.l))

E=Ele()
while(True):
  print("0. Exit\n1. Add\n2. Delete \n3. Display")
  ch=int(input())
  if(ch==1):
    e=int(input("Enter number to append:"))
    E.append(e)
  elif(ch==2):
    e=int(input("Enter number to remove:"))
    E.delete(e)
  elif(ch==3):
    E.display()
  elif(ch==0):
    print("Exiting!")
    break
    
    