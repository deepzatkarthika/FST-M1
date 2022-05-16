player1=input("Enter action by player1")
player2=input("Enter action by player2")

player1Pnt=0
player2Pnt=0

"""
RULES:
Rock beats scissors
Scissors beats paper
Paper beats rock

"""
if player1 in player2 :
    print("No point for both")
elif (player1 in "rock" and player2 in "scissors") or (player1 in "scissors" and player2 in "paper") or (player1 in "paper" and player2 in "rock"):
    player1Pnt=+1

else:
    player2Pnt=+1

print("player1Point = ")
print(player1Pnt)
print("player2Point = ")
print(player2Pnt)