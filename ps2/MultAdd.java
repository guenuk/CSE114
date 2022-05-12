//Geunuk Na, geunuk.na@stonybrook.edu
public class MultAdd {
    
    public static double multAdd (double a, double b, double c) {
	return a*b+c;
    }

    public static void yikes (double x) {
	System.out.println("Value of third given equation is:"
			   + multAdd(x, Math.exp(-x), Math.sqrt(1-(Math.exp(-x)))));
    }
			   
    public static void main (String[] args) {
	System.out.println("Value of 1.0 * 2.0 + 3.0 is : "
			   + multAdd(1.0, 2.0, 3.0));
	double a = Math.sin((Math.PI)/4);
	double b = 1.0/3.0;
	double c = Math.cos(Math.PI/4);
	System.out.println("Value of first given equation is:"
			   + multAdd(a,b,c));
	a = Math.log10(10);
	b = 1.0;
        c = Math.log10(20);
	System.out.println("Value of second given equation is:"
			   + multAdd(a,b,c));
	yikes(5.0);
    }
}
			   
