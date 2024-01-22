#numList = [10, 20, 30, 40, 10]

numList = list(input("Enter a sequence of comma separated values: ").split(", "))

fnum = numList[0]
lnum = numList[-1]
print("Given list : ",numList)
print("First number in the given list : " + str(fnum))
print("Last number in the given list : " + str(lnum))

if fnum == lnum:
    print("True")
else:
    print("False")