import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaxiFare taxiFare = new TaxiFare();
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter total distance traveled. (In Km only)");
        float distance = scan.nextFloat();
        float total = taxiFare.getFareForDistance(distance);

        if(total<0) System.out.print("Invalid Distance");
        else System.out.print("Total Fare for distance "+distance + "Km traveled : " + total + "Rs");
    }


}
