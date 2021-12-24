using System;

namespace HomeNS
{
    /// <summary>
    /// Bank account demo class.
    /// </summary>
    public class Home
    {
        public class TaxiFare {
            public double getFare(double? distance)
            {
                if(distance==null||distance<=0){
                    return -1;
                }

                double dist = (double) distance;
                
                if(distance<=2) return 50.00;
                if(distance<=5) return dist*20;
                if(distance<=15) return (5*20)+((dist-5)*18);
                return (5*20)+(10*18)+((dist-15)*15);  
                
            }
        }

        public static void Main()
        {
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
        }
    }
}





