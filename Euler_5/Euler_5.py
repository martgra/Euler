__author__ = 'Martin'

c=1*2*3*5*7*11*13*17*19
f=c
counter = False
i=1
while counter != True:
    counter=True
    for x in range (21):
        if (c%(x+1) != 0):
            c=c+f
            counter=False
            break
    if (counter == True):
        print (c)
