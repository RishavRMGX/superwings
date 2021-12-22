// See https://aka.ms/new-console-template for more information
Console.WriteLine("Please enter total distance traveled. (In Km only): ");

TaxiFare taxiFare = new TaxiFare();
String? input = Console.ReadLine();
if(input==null ){
    Console.WriteLine("Distance Not Found");
}else {
    double distance = Single.Parse(input);
    double fare = taxiFare.getFare(distance);
    if(fare<0) Console.WriteLine("Invalid Distance");
    else Console.WriteLine("Total fare for distance traveled "+distance+" Km is "+fare+ "Rs");
}





