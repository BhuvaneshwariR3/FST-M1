numList1 = list(input("Enter a sequence of comma separated values for First list: ").split(", "))
numList2 = list(input("Enter a sequence of comma separated values for Second list: ").split(", "))

numList = []

for num in numList1:
    if int(num) % 2 != 0:
        numList.append(num)

for num in numList2:
    if int(num) % 2 == 0:
        numList.append(num)

print(numList)
