# Given lists
tuple_num = (10, 20, 23, 125, 17)
print("Given list is: " + str(tuple_num))

print("Print the numbers from the tuple which are divisible by 5:")
for num in tuple_num:
    if int(num) % 5 == 0:
        print(num)

