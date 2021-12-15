def get_fare(dist):
    first_five_km = 5 * 20
    ten_km_after_first_five = 10 * 18
    if dist<0:
        return -1
    elif dist<=2:
        return float(50)
    elif dist<=5:
        return dist * 20
    elif dist<=15:
        return first_five_km + (dist - 5) * 18
    else:
        return first_five_km + ten_km_after_first_five + (dist - 15) * 15


distance = float(input("Please enter total distance traveled. (In Km only)"))
total = get_fare(distance)

if distance<0:
    print("Invalid Distance")
else:
    print("Total Fare for distance "+str(distance) + " Km traveled : " + str(total) + "Rs")