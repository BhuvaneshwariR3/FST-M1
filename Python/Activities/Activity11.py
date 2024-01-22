dict_fruits = {
    "apple": 20,
    "mango": 50,
    "banana": 30
}

fruit_key = input("Enter the fruit that you are looking for:").lower()

if fruit_key in dict_fruits:
    print(fruit_key + " is available in the basket")
else:
    print("sorry, " + fruit_key + " is not available in the basket")
