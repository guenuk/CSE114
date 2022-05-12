//Geunuk Na, Geunuk.na@stonybrook.edu
// Hint: in emacs, use a tab key on each line starting from the first line.
import java.util.Scanner;
public class Ugly {
    
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Celcius temperature (real number): ");
        double cel = scan.nextDouble();
        double fahr = c2f(cel); // Line 1
	System.out.println(cel + " Celcius = " + fahr + " Fahrenheit.");
        System.out.print("Enter a Celcius temperature (real number): ");
        cel = scan.nextDouble();
	c2f(cel);        // Line 2
        System.out.println(cel + " Celcius = " + fahr + " Fahrenheit.");
	System.out.print("Enter a Fahrenheit temperature (real number): ");
        fahr = scan.nextDouble();
	cel = f2c(fahr);      // Line 3
        System.out.println(fahr + " Fahrenheit = " + cel + " Celcius.");
        System.out.print("Enter a Fahrenheit temperature (real number): ");
        fahr = scan.nextDouble();
        f2c(fahr);     // Line 4
        System.out.println(fahr + " Fahrenheit = " + cel + " Celcius.");
    }

    public static double c2f (double cel) {
	System.out.print("In cf2. . .");
	double fahr = (9.0/5.0) * cel + 32.0;  // Line 1
	return fahr;
    }

    public static double f2c (double fahr) {
	double cel = (fahr - 32.0) * (5.0/9.0);
	return cel;
    }	  	
}
