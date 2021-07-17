#Non-GUI Bus Fare Calculator
from datetime import date

#Introducing the program
def main():
    print("Welcome to the Bus Fare Calculator!")
    start()

#Calls the different function and makes the program run.
def start():
    print("\n\tTo determine your fare, please enter the following: ")
    dob()
    time()
    ages()
    prices()
    coupons()

#Calculates todays date.
def time():
    twoday = date.today()
    today = twoday.strftime("%m %d %Y")
    todayParts = today.split(" ")
    while("" in todayParts):
        todayParts.remove("")
    global cMonth 
    cMonth = int(todayParts[0])
    global cDay 
    cDay = int(todayParts[1])
    global cYear 
    cYear = int(todayParts[2])
    return cMonth, cDay, cYear
    
#Calculates users date of birth to determine bus fare price.
def dob():
    print("\n\t\tPlease enter your date of birth")
    global bMonth 
    global bDay 
    global bYear 
    try:
        bMonth2 = input("\t\t\tMonth ex.(mm): ").lstrip().rstrip()
        bMonth = int(bMonth2)
        x = sum(a.isdigit() for a in bMonth2)
        bDay2 = input("\t\t\tDay ex.(dd): ").lstrip().rstrip()
        bDay = int(bDay2)
        y = sum(b.isdigit() for b in bDay2)
        bYear2 = input("\t\t\tYear ex.(yyyy): ").lstrip().rstrip()
        bYear = int(bYear2)
        z = sum(c.isdigit() for c in bYear2)
        if(((x or y) != 2) or (z != 4)):
            invalid()
            dob()
    except ValueError:
            invalid()
            dob()

#Calculates users age and accounts for cases.
def ages():
    age = cYear - bYear
    months = 0
    month = 0
    tmonths = 0
    global rAge
    if bMonth > cMonth:
        rAge = age -1
        tmonths = bMonth - cMonth
        months = 12 - tmonths
        
    elif bMonth < cMonth:
        rAge = age
        tmonths = cMonth - bMonth
        month = 12 - tmonths
        months = 12 - month
        
    elif bMonth == cMonth:
        if bDay > cDay:
           rAge = age - 1
           tmonths = bMonth - cMonth
           months = 12 - tmonths

#Sets bus fare prices.
def prices():
    global price
    if rAge < 15:
        price = 5
        
    elif rAge > 14 and rAge < 65:
        price = 9
    
    elif rAge > 65:
        price = 7.50
    
    return price

#Asks user if the have a discount for their bus fare.
def coupons():
    coupon = input("\n\t\tDo you have a bus fare discount (y n): ").lstrip().rstrip()
    total = price
    if(coupon == "y"):
        total = price - 1
        print("\n\tYour bus fare will be ${:.2f}.".format(float(total)))
    elif(coupon == "n"):
        print("\n\tYour bus fare will be ${:.2f}.".format(float(total)))
    else:
        invalid()
        coupons()
    next()

#Asks the user what they would like to do next.
def next():
    print("\n\t\tIf you would like to calculate another bus fare enter 1.\n\t\tIf you would like to exit the program enter 2.")
    choice = input("\n\t\tEnter option: ").lstrip().rstrip()
    if(choice == "1"):
        start()
    elif(choice == "2"):
        quit()
    else:
        invalid()
        next()

#Prints error message.
def invalid():
    print("\t\tYour entry was INVALID! Please try again.")
    
main()