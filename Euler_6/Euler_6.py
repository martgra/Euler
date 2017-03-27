__author__ = 'Martin'
import math
c=0
d=0

for x in range(101):
    c=c+x
    d=d+math.pow(x,2)
c=math.pow(c,2)
print (c-d)