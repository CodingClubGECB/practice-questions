#3.Write a program to find the average of numbers in an array.

ar = input().split()

ar = [int(i) for i in ar]

s = 0

for i in ar:
	s += i

avg = s / len(ar)

print(avg)
