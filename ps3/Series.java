public class Series {
    public static double series (double x, int n) {
	double result = 0.0;
	for (int i=0; i<=n; i++){
	    double sequence = (-i * (Math.pow(-1.0,i))) * (Math.pow(x,(i - 1.0)));
	    result += sequence;
	}
	return result;
    }
    public static void main (String[] args) {
	System.out.println("series(0.5, 1) should be 1.0");
	System.out.println(" : " + series(0.5, 1));
    }
}
	
