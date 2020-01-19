class Calc:
  def __init__(self,n1,n2):
    self.n1=n1
    self.n2=n2
  def add(self):
    print("Result:  "+str(self.n1+self.n2))
  def sub(self):
    print("Result:  "+str(self.n1-self.n2))
  def mul(self):
    print("Result:  "+str(self.n1*self.n2))
  def div(self):
    print("Result:  "+str(self.n1/self.n2))
n1=int(input())
n2=int(input())
c=Calc(n1,n2)
while(True):
  print("0. Exit\n1. Add\n2. Subtraction \n3. Multiplication\n4. Division\nEnter choice:")
  ch=int(input())
  if(ch==1):
    c.add()
  elif(ch==2):
    c.sub()
  elif(ch==3):
    c.mul()
  elif(ch==4):
    c.div()
  elif(ch==0):
    print("Exiting!")
    break
  
  