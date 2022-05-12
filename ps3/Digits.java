//Geunuk Na, geunuk.na@stonybrook.edu
import java.util.Scanner;
public class Digits {

    public static int numDigits (int n, int which){
	int x = 0;
	if (which == 0) {
	    x = numZeros(n);
	}
	else if (which == 1) {
	    x = numOdds(n);
	}
	else if (which == 2) {
	    x = numEvens(n);
	}
	return x;
    }
    public static boolean isEven (int n) {
	return n%2 == 0;
    }
    
    public static int numEvens (int n) {
	int evennumber = 0;
	while (n>0){
	    if(isEven(n%10) && (n%10 != 0)) {
		evennumber += 1;
	    }
	    n /= 10;
	}
	return evennumber;
    }
    
    public static int numOdds (int n) {
	int oddnumber = 0;
	while (n>0) {
	    if(!isEven(n%10) && (n%10 != 0)) {
		oddnumber += 1;
	    }
	    n /= 10;
	}
	return oddnumber;
    }
    
    public static int numZeros (int n) {
	int zeronumber = 0;
	while (n>0) {
	    if(n%10 == 0) {
		zeronumber += 1;
	    }
	    n /= 10;
	}
	return zeronumber;
    }
    
    public static void main (String[]args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Type an integer:");
	int number = scan.nextInt();
	System.out.println( number + " contains " + numEvens(number) + " evens, "
			    + numOdds(number) + " odds, and " + numZeros(number) + " zeros.");
	System.out.println( number + " contatins " + numDigits(number,2) + " event, " + numDigits(number, 1) + " odds, and " + numDigits(number, 0) + " zeros.");
	
    }
}
