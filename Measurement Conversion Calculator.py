#Non-GUI Menu/Conversions

#Introducing the program.
print ("Welcome to the Conversion Calculator!")

#What happens with the user input.
def main():
    choice = displayMenu()
    while choice != "6":
        if choice == "1":
            feetMeters()
        elif choice == "2":
            metersFeet()
        elif choice == "3":
            ftc()
        elif choice == "4":
            ctf()
        elif choice == "5":
            phrase()
        choice = displayMenu()
    print("\nThanks for using the Conversion Calculator!")

#Displays options for the user to take.
def displayMenu():
    myChoice = "0"
    while myChoice != "1" and myChoice != "2" and myChoice != "3" and myChoice != "4" \
    and myChoice != "5" and myChoice != "6":
        print("""\tPlease choose one of the following options:
        \t1. Convert feet to meters
        \t2. Convert meters to feet
        \t3. Convert Fahrenheit to Celsius
        \t4. Convert Celsius to Fahrenheit
        \t5. Display a phrase or number backwards
        \t6. Quit""")
        myChoice = input("\n\tEnter option: ").lstrip().rstrip()
        if myChoice != "1" and myChoice != "2" and \
            myChoice != "3" and myChoice != "4" and myChoice != "5" and myChoice != "6":
            print("\n\t\tInvalid option. Please try again.\n")
    return myChoice

#Calculates feet to meters.
def feetMeters():
    try:
        theNum = (float(input("\n\t\tPlease enter the number of feet: ")))
        if(type(theNum) == str):
            print("\n\t\tYour entry was INVALID! Please try again.\n")
            feetMeters()
        meters = theNum / 3.2808
        print("\t\t",theNum, "feet converted to meters is {0:.3f}".format(meters), "meters.\n")
    except ValueError:
        print("\n\t\tYour entry was INVALID! Please try again.\n")
        feetMeters()

#Calculates meters to feet.
def metersFeet():
    try:
        theNum = (float(input("\n\t\tPlease enter the number of meters: ")))
        feet = theNum * 3.2808
        print("\t\t",theNum, "meter(s) converted to feet is {0:.3f}".format(feet), "feet.\n")
    except ValueError:
        print("\n\t\tYour entry was INVALID! Please try again.\n")
        metersFeet()
        
#Calculates fahrenheit to celsius.
def ftc():
    try:
        theNum = (float(input("\n\t\tPlease enter the degrees in Fahrenheit: ")))
        cels = (theNum - 32) * (5/9)
        print("\t\t",theNum, "fahrenheit converted to celsius is {0:.3f}".format(cels), "celsius.\n")
    except ValueError:
        print("\n\t\tYour entry was INVALID! Please try again.\n")
        ftc()
        
#Calculates celsius to fahrenheit.
def ctf():
    try:
        theNum = (float(input("\n\t\tPlease enter the degrees in Celsius: ")))
        fahr = (theNum * (9/5)) + 32
        print("\t\t",theNum, "celsius converted to fahrenheit is {0:.3f}".format(fahr), "fahrenheit.\n")
    except ValueError:
        print("\n\t\tYour entry was INVALID! Please try again.\n")
        ctf()

#Prints out a phrase or number backwards.
def phrase():
    phr = input("\n\t\tPlease enter a phrase or number: ").lstrip().rstrip()
    print("\t\tThe phrase or number backwards is:", phr[::-1], "\n")

main()