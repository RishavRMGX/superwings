import java.util.*;
import java.util.stream.IntStream;

public class Home {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to check if its even. ");
        int num1 = scan.nextInt();
        EvenChecker evenChecker = new EvenChecker();
        Boolean evenResult = evenChecker.checkEvenNumber(num1);
        if(evenResult==null) System.out.println("Invalid Number");
        else if (evenResult) System.out.println(num1 + " is Even Number");
        else System.out.println(num1 + " is not Even Number");

        System.out.println("Enter year to check if its leap year. ");
        int year = scan.nextInt();
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Boolean leapYearResult = leapYearChecker.checkLeapYear(year);
        if(leapYearResult==null) System.out.println("Invalid Year");
        else if(leapYearResult) System.out.println(year + " is a Leap Year");
        else System.out.println(year + " is not Leap Year");

        System.out.println("Enter size of array. ");
        int n = scan.nextInt();
        System.out.println("Enter array to get median. ");
        Float[] arryInput = new Float[n];
        for (int i=0; i<n; i++) arryInput[i]= scan.nextFloat();
        MedianFinder medianFinder = new MedianFinder();
        Float medianResult = medianFinder.medianFinder(arryInput, n);
        if(medianResult==null) System.out.println("Invalid Input");
        System.out.println("Median of array is "+ medianResult);
    }
}
