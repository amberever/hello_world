print("hello world")

# ask for a number
num = input("Enter a number: ")

# check the number between 1 and 10
if 1 <= int(num) <= 10:
    print("Valid number")
else:
    print("Invalid number")

# print 0 .. to the number
for i in range(int(num) + 1):
    print(i)
    