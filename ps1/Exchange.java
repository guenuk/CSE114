//Geunuk Na, geunuk.na@stonybrook.edu
import java.util.Scanner;
public class Exchange {
    
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much dollars do you want to exchange?: ");
        double dollar = scan.nextDouble();
        double euro = dollar * 0.89;
        double won = dollar * 1134.50;
        System.out.println("Your US Dollar value are: ");
        System.out.println("Euro:" + euro + " Euro");
        System.out.println("Won:" + won + " Won");
	
    }
}
