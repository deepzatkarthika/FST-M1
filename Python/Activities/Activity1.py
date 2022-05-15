from copy import deepcopy
from datetime import date

name=input("Enter your name")
age=input("Enter your age")
year=date.today().year
agediff=int(100)-int(age)
print(agediff)
ageHun=year+agediff
print(ageHun)
s="You will turn 100 in {} "

print(s.format(agediff))