#1.Write a program to count the number of digits in a number.

n = int(input())

count = 0

while n != 0:
	n = int(n / 10)
	count += 1

print(count)



# An easier way
'''
n = input()
count = len(n)
print(count)'''
