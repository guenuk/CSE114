//Geunuk Na, Geunuk.na@stonybrook.edu
public class Param {
    
    public static void pars (int birth, double mortgage, double euro, boolean sunday, String country) {
	System.out.println(birth + " is the year of my birth ");
	System.out.println(mortgage + " is current 30-year fixed mortgage rate");
	System.out.println(euro + " is current exchange rate in euros for a dollar");
	System.out.println(sunday + " is a boolean expression for a false statement");
	System.out.println(country + " is where I was born");
    }
    
    public static void main (String[] args) {
	int birth = 1998;
	double mortgage = 4.49;
	double euro = 0.88;
	boolean sunday = false;
	String country = "Korea";
	pars(birth, mortgage, euro, sunday, country);
    }
}
	    
    
