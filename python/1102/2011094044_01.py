import random

li=[]
for k in range(1,46):
    li.append(k)
    random.shuffle(li)
    a=li[:5]

a.sort(reverse=True)
print(a)
