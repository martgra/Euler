import math
c=999
d=999
e=0
current=0
while c > 99:
	while d > 99:
#		print c
#		print d
		e=c*d
		j=e
		digits=int(math.log10(e))+1
		f=0
#		print 'e = ', e
		palindrome = True
		while f <=(digits/2)+1:
			g = 0
			h = 0
			g = int(e/math.pow(10, digits-1))
#			print 'g = ', g
			h=int(e%10)
#			print 'h = ', h
			if g!=h:
				palindrome = False
				f=digits+2
			e=int(e%math.pow(10, digits-1))
#			print 'e etter modulo ', e
			e=int(e/10)
#			print 'e etter /10 ', e
			f+=1
			digits-=2

		if palindrome == True:
			if j > current:
				current=j
				print (c, d)
				print (j)
		d-=1
		
	c-=1
	d=c
