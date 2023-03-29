import random
jackpot = random.randint(1,100)
guess = int(input('Guess number between 1 to 100: '))

while guess != jackpot:
    if guess<jackpot:
        print("Guess higher number")
    else:
        print('Lower number')

    guess = int(input('Guess number between 1 to 100: '))

print("correct")