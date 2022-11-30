def calculate_earnings(egg_number):
    percentage = 1.0
    for x in range (0, egg_number):
        percentage *= 1.05
    return percentage

egg_number = int(input("How many eggs of prophecy do you have? "))
percentage = str(int(round(calculate_earnings(egg_number) * 100, 0)))
print("\nWith "+ str(egg_number) + " mystical eggs, your earnings percentage is: " + percentage +"%")
