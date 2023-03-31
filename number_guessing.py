import random
from Fraction import Fraction
x = Fraction(3,4)
y= Fraction(5,6)
print(x+y)
jackpot = random.randint(1,100)
guess = int(input('Guess number between 1 to 100: '))

while guess != jackpot:
    if guess<jackpot:
        print("Guess higher number")
    else:
        print('Lower number')

    guess = int(input('Guess number between 1 to 100: '))

print("correct")