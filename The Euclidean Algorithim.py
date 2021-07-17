##Non-GUI Euclid_Algorithim

#Introducing program.
print("Welcome to the Euclid Algorithim Program!")
    
def main():
    #Displaying the menu.
    choice = displayMenu()
    
    #Choose what happens with the users input.
    if choice == "1":
        GCD()
    elif choice == "2":
        quit()
    
def displayMenu():
    #Set myChoice to zero to later catch errors.
    myChoice = "0"
    
    #Define what choices the user has.
    while myChoice != "1" and myChoice != "2":
        print("""\nPlease enter one of the following options:
        Enter 1 to continue to the Euclid Algorithim program
        Enter 2 to exit the Euclid Algorithim program
        """)
        
        #Capture users input and strip away whitespace.
        myChoice = input("\tEnter Option: ").lstrip().rstrip()
        
        #Catch input error.
        if myChoice != "1" and myChoice != "2":
            print("\n\t You have entered an INVALID option. Please try again.")
            
    #Return users input.
    return myChoice

def GCD():
    #Tell the user what to do.
    print("\n\tEnter two positive integers")
    
    #Catch user input and strip whitespace.
    num1 = input("\t\tFirst integer: ").lstrip().rstrip()
    
    #Making sure input is an integer. If invalid input user has to input again.
    try:
        num = int(num1)
    except ValueError:
        print("\n\t\tYou have entered an INVALID character. Please try again!")
        GCD()
    
    #Catch user input and strip whitespace.
    num2 = input("\t\tSecond integer: ").lstrip().rstrip()
    
     #Making sure input is an integer. If invalid input user has to input again.
    try:
        num3 = int(num2)
    except ValueError:
        print("\n\t\tYou have entered an INVALID character. Please try again!")
        GCD()
        
    #Finding the greatest common divisor
    rem = 0
    while num3 > 0:
        rem = num % num3
        num = num3
        num3 = rem
    
    #Output the results
    print("\tThe GCD is " + str(num) + "\n")
    
    #Start the process again
    main()
    
#Begins the program
main()