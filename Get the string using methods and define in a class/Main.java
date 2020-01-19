class acc:
  def __init__(self,s):
    self.s=s
  def inp(self):
    pass
  def display(self):
    print(self.s)
s=input()
a=acc(s)
print("The method that the string accepted is:")
a.display()