#Non-GUI Median

#Introducing the program.
print("Welcome to the Median Finding program!")
    
def main():
    #Displaying the menu.
    choice = displayMenu()
    
    #Choose what happens with the users input.
    if(choice == "1"):
        median()
    elif(choice == "2"):
        quit()
    
def displayMenu():
    #Set myChoice to zero to later catch errors.
    myChoice = "0"
    
    #Define what choices the user has.
    while((myChoice != "1") and (myChoice != "2")):
        print("""\n\tPlease enter one of the following options:
        \tEnter 1 to continue to the Median program.
        \tEnter 2 to exit the Median program.
        """)
        
        #Capture users input and strip away whitespace.
        myChoice = input("\t\tEnter Option: ").lstrip().rstrip()
        
        #Catch input error.
        if((myChoice != "1") and (myChoice != "2")):
            print("\n\t\tYou have entered an INVALID option. Please try again.")
    
    #Return users input.
    return myChoice
    
def median():
    #Tell the user what to do.
    num1 = input("\n\tPlease enter the numbers you'd like to find the median of. Please separated by a space ex.(# # # #...): ")

    #Split input into list.
    nums = num1.split(" ")
    
    #Remove any whitespace.
    while("" in nums):
        nums.remove("")
    
    #Catching input errors that are not numbers.
    for i in nums:
        try:
           float(i)
        except ValueError:
            print("\n\t\tYou have entered an INVALID character. Please try again!")
            median()
            
    #Sorts the numbers from smallest to largest.  
    nums.sort()
    
    #Deletes duplicates
    num = []
    for x in nums:
        if x not in num:
            num.append(x)
    
    #Finds length of list
    length = len(num)
    
    try:
        #Finds the median of even number of numbers
        if(length % 2 == 0):
            med2 = (float(num[(length)//2]) + float(num[((length)//2)-1]))
            med = med2/2
        
        #Finds the median of odd number of numbers
        else:
            med = num[((length)//2)]
            
        #Output the results
        print("\n\t\tThe median is " + str(med))
    
    except IndexError:
        print("\n\t\tYour entry was INVALID! Please try again.")
        median()
        
    #Program starts again until user exits
    main()
    
#Begins the Program
main()