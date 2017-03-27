import math
primes=[0 for j in range(10001)]
primes[0]=2
primes[1]=3
prime=True
x=1
i=3

while x <= 10000:
    prime=True
    for a in range(x):
        if i%primes[a]==0:
            prime=False
            break
    if prime==True:
        primes[x]=i
        x+=1
    i+=2
print (primes[10000])