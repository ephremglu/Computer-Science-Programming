#Non-GUI Prime Numbers with the Sieve of Eratosthenes

print ("Welcome to the Prime Number Calculator!")

#Introduces the program and starts the process.
def main():
    choice = displayMenu()
    while choice != "3":
        if choice == "1":
            global myList
            myList = cList()
        elif choice == "2":
            dPrime(myList)
        choice = displayMenu()

#Displays the options for the user to take.
def displayMenu():
    myChoice = "0"
    while myChoice != "1" and myChoice != "2" and myChoice != "3":
        print("""\n\tPlease choose one of the following options:
        \t1. Create a list of primes from 2 to n using the Sieve of Eratosthenes algorithm.
        \t2. Display the prime numbers.
        \t3. Quit.""")
        myChoice = input("\n\tEnter option: ")
        if myChoice != "1" and myChoice != "2" and myChoice != "3":
            print("\n\tInvalid option. Please try again.")
        if(myChoice == "3"):
            quit()
    return myChoice

def myList():
    myList = cList()
    dPrime(cList)

#Asks the user for the upper limit of primes to find.
def cList():
    myList = []
    while True:
        try:
            limit = int(input("\n\t\tEnter upper limit: "))
            if limit < 2:
                raise ValueError
            break
        except ValueError:
             print("\nInvalid value for upper limit, please try again.")
    for value in range(2, limit + 1):
        myList.append(value)
    return myList

#Finds the prime numbers.
def dPrime(myList):

    try:
        length = len(myList)
        for i in range(length):
            if myList[i] !=0:
                for j in range(i + 1, length):
                    if myList[j] % myList[i] == 0:
                        myList[j] = 0
        for item in myList:
            if item != 0:
                x = item
                y = end = ", "
                print("\n\t\t" + str(x) + str(y))
    except TypeError:
        print("""\n\t\tYou have entered an option where there exits no upper limit, you must first create a list!
        \tPlease try again.""")
        displayMenu()
              
main()