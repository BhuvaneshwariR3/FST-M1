import pandas


data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Char113", "AllMight"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("../resources/sample.csv", index=False)
