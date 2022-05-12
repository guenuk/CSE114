//Geunuk Na, geunuk.na@stonybrook.edu
import java.util.Scanner;
public class Change {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much Dollars do you have?:");

        double dollar = scan.nextDouble();

        int bills = (int)dollar;
        double coins = dollar - bills;

        int twentydollarbills = bills/20;
        int tendollarbills = (bills%20)/10;
        int fivedollarbills = ((bills%20)%10)/5;
        int onedollarbills = (((bills%20)%10)%5)/1;

        int quarters = (int)(coins/0.25);
        int dimes = (int)((coins%0.25)/0.1);
	int nickles = (int)(((coins%0.25)%0.1));
        int pennies = (int)((((coins%0.25)%0.1)/0.01));
	System.out.println("Debug: " + ((((coins%0.25)%0.1)/0.01)));

        System.out.println("     " + twentydollarbills + " twenty dollar bills" +
                   "\n     " + tendollarbills + " ten dollar bills" +
                   "\n     " + fivedollarbills + " five dollar bills" +
                   "\n     " + onedollarbills + " one dollar bills" +
                   "\n     " + quarters + " quarters" +
                   "\n     " + dimes + " dimes" +
                   "\n     " + nickles + " nickles" +
                   "\n     " + pennies + " pennies");
    }
}

		       
			   
	    
	
