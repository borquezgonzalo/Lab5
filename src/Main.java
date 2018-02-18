import java.util.Scanner;
public class Main{

/* Comment for github lab assingment*/
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        int mpg;
        double tc;
        double tf;

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        mpg=scanner.nextInt();

        if (mpg <= 0){
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        tc=scanner.nextDouble();

        if (tc <= 0){
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        tf=scanner.nextDouble();

        if (tf < 0 || tf > 100.0){
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }

        double rawrange;
        rawrange = mpg * tc * tf * .01;
        rawrange=Math.floor(rawrange);

        if (rawrange <= 25) {
            System.out.print("Attention! Your current estimated range is running low: " + (int)rawrange + " miles left!!!");
        }
        else {
            System.out.print("Keep driving! Your current estimated range is: " + (int)rawrange + " miles!");
        }
    }
}
