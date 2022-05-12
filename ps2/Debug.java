/* Geunuk Na, geunuk.na@stonybrook.edu

We will use the following distance formula to calculate the distance
between two points: (x1, y1) and (x2, y2):

               --------------------------
              /          2             2
   dist =    /  (x2 - x1)   + (y2 - y1)
           \/

*/
public class Debug {

    public static double difference (double a, double b) {
        return b - a;
    }

    public static double square (double x) {
        return x * x;
    }

    public static double sumOfSquares (double x, double y) {
        double sqx = square(x);
        double sqy = square(y);
        double sum = sqx + sqy;
        return sum;
    }

    public static double squareRoot (double x) {
        // I am using the sqrt function from the Math package.
        // If you want to know the documention on Math.sqrt(...), go
        // to the class web page and try the "Browse the J2SE 6.0 API
        // documentation" link.  There find java.lang package.  Then
        // under the Classes heading you will find Math.  If you click
        // on Math, you will see 'sqrt' under the Method Summary section.
        return Math.sqrt(x);
    }

    public static double distance (double x1, double y1, double x2, double y2) {
        // Line 1
	System.out.println("x1=" + x1 + " y1=" + y1 + " x2=" + x2 + " y2=" + y2);
        double deltax = difference(x1, x2);
        // Line 2
	System.out.println("deltax = " + deltax);
        double deltay = difference(y1, y2);
        double sum = sumOfSquares(deltax, deltay);
        // Line 3
	System.out.println("sum = " + sum);
        double dist = squareRoot(sum);
        return dist;
    }

    public static void main (String[] args) {

        // This program computes the distance between two points (x1, y1)
        // and (x2, y2)

        double x1 = 3.5;
        double y1 = 4.5;
        double x2 = 6.5;
        double y2 = 8.5;
        System.out.println("Distance should be 5.0 and computed is "
                           + distance(x1, y1, x2, y2));
    }
}
