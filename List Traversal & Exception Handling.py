#Non-GUI List Traversal and Exception Handling

print ("Welcome to the Array Traversal Calculator!")

def main():
    theList = []
    choice = displayMenu()

    while choice != "6":
        if choice == "1":
            addList(theList)
        elif choice == "2":
            theMean(theList)
        elif choice == "3":
            median(theList)
        elif choice == "4":
            pList(theList)
        elif choice == "5":
            pListReverse(theList)
        choice = displayMenu()

    print("\nThanks for using the Array Traversal Calculator!")

def displayMenu():
    myChoice = "0"
    
    while myChoice != "1" and myChoice != "2" and myChoice != "3" and myChoice != "4" \
    and myChoice != "5" and myChoice != "6":
        print("""\n\tPlease choose one of the following options:
        \t1. Add a number to the list/array
        \t2. Display the mean
        \t3. Display the median
        \t4. Print the list/array to the screen
        \t5. Print the list/array in reverse order
        \t6. Quit""")
        myChoice = input("\n\tEnter option: ")

        if myChoice != "1" and myChoice != "2" and \
            myChoice != "3" and myChoice != "4" and myChoice != "5" and myChoice != "6":
            print("\n\t\tInvalid option. Please try again.")

    return myChoice

def addList(theList):
    while True:
        addOne1 = input("\n\t\tEnter a collection of non-negative integers ex.(# # #...): ").lstrip().rstrip()
        if(addOne1 == ""):
            print("\n\t\tYour entry was INVALID! Please try again.")
            addList(theList)
        addOne = addOne1.split(" ")
        while("" in addOne):
            addOne.remove("")
        break
    theList.append(addOne)

def theMean(theList):
    total = 0
    if len(theList) > 0:
        for item in theList:
            total = total + item
            mean = total / len(theList)
        print("\n", mean)

def median(theList):
    copyList = theList.copy()
    copyList.sort()
    length = len(copyList)
    if length % 2 == 0:
        median = (copyList[(length)//2] + copyList[(length)//2-1])/2
    else:
        median = copyList[length//2]
    print("\n", median)
    
def pList(theList):
    for item in theList:
        print("\n", item)
    print("\n", theList)
    
def pListReverse(theList):
    for i in range(len(theList)//2):
        temp = theList[i]
        theList[i] = theList[len(theList)-1-i]
        theList[len(theList)-1-i] = temp
    print(theList)
    
main()