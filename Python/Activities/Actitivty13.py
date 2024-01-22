def sum(num):
    sum = 0
    for n in num:
        sum += n
    return sum


numList = [10, 30, 20, 10, 50]

res = sum(numList)

print(res)
