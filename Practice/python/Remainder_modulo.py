str = "121"
num = 0
for i in range(len(str)):
    num = num*10+int(str[i])
print(num)
rem = num % 11
print(rem)