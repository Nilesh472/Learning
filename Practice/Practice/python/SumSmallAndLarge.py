arr = [2,1,3,4,5]
small = arr[0]
large = arr[0]
for i in range(1, len(arr)):
    if(small > arr[i]):
        small = arr[i]
    if(large < arr[i]):
        large = arr[i]

sum = small + large
print(sum)