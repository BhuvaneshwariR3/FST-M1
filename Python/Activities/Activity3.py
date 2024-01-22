user1 = input("Enter Player 1's name : ")
user2 = input("Enter Player 2's name : ")

user1_choice = input(user1 + " do you want to choose rock, paper or scissors : ").lower()
user2_choice = input(user2 + " do you want to choose rock, paper or scissors : ").lower()

if user1_choice == user2_choice:
    print("It's a tie")
elif user1_choice == "rock":
    if user2_choice == "paper":
        print(user2 + " wins")
    elif user2_choice == "scissors":
        print(user1 + " wins")
    else:
        print("Incorrect input")
elif user1_choice == "paper":
    if user2_choice == "rock":
        print(user1 + " wins")
    elif user2_choice == "scissors":
        print(user2 + " wins")
    else:
        print("Incorrect input")

elif user1_choice == "scissors":
    if user2_choice == "rock":
        print(user2 + " wins")
    elif user2_choice == "paper":
        print(user1 + " wins")
    else:
        print("Incorrect input")
