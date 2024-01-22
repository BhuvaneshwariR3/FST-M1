import pandas


dataframe = pandas.read_csv("../resources/sample.csv")

print("Full Data:")
print(dataframe)

print("==============")
print("Usernames:" + dataframe["Usernames"])

print("==============")
print("Usernames: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("==============")
print("Usernames in ascending order")
print(dataframe.sort_values("Usernames"))

print("==============")
print("Passwords in descending order")
print(dataframe.sort_values("Passwords", ascending=False))
