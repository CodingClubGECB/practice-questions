#4.Write a program to find the power of a number using recursion

def power(x, n):
	if n == 0:
		return 1
	else:
		return x * power(x, n - 1)

x = int(input())
n = int(input())

print(power(x, n))
