def fib(num):
    if num <= 1:
        return num
    else:
        return fib(num - 1) + fib(num - 2)


fibNum = int(input("Enter the number until the fibonacci series needs to be calculated:"))

if fibNum <= 0:
    print("Please enter a positive num")
else:
    print("Fibonacci series:")
    for i in range(fibNum):
        print(fib(i))
