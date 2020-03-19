#1.Write a program to print the multiplication table of a number upto 10. 

n = int(input())

for i in range(11):
	print(n, " x ", i, " = ", n*i)
