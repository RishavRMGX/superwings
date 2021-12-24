from TaxiFare import TaxiFare

distance = float(input("Please enter total distance traveled. (In Km only)"))
taxiFare = TaxiFare()
total = taxiFare.get_fare(distance)

if total is None:
    print("Invalid Distance")
elif total < 0:
    print("Total Fare for " + str(distance) + " is 50Rs")
else:
    print("Total Fare for distance " + str(distance) + " Km traveled : " + str(total) + "Rs")
