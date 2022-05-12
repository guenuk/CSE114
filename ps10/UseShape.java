//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public class UseShape {

    public static void main (String[] args) {
        Shape s1 = new Circle(0.0, 0.0, 1.0);
        s1.translate(10.0, 10.0);
        s1.scale(3.0);
        System.out.println(s1); 
        intAngAndPeri(s1);

        s1 = new Rectangle(1.0, 1.0);
        s1.translate(10.0, 10.0);
        s1.scale(3.0);
        System.out.println(s1);
        intAngAndPeri(s1);  
        
        s1 = new Triangle(0.0,0.0,5.0,5.0);
        s1.translate(10.0,10.0);
        s1.scale(3.0);
        System.out.println(s1);
        intAngAndPeri(s1);
        
        heterogeneousArray();   
        trouble();
    }


    public static void intAngAndPeri (Shape s) {
        System.out.println("\nIn intAngAndPeri (InternalAngle and Perimeter) . . .");
        System.out.println(s);
        System.out.println(" Perimeter: " + s.perimeter());
        if(s.internalAngle() == -1.0) {
        	System.out.println("Circle does not have internal angle.");
        }
        else {
        System.out.println("InternalAngle: "+ s.internalAngle());
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void heterogeneousArray () {
        System.out.println("\nIn heterogeneousArray . . .");
        Shape[] ha = new Shape[4];
        ha[0] = new Circle(10.5, 11.4, 12.5);
        ha[1] = new Rectangle(20.4, 21.5);
        ha[2] = new Circle(11.5, 12.4, 13.5);
        ha[3] = new Triangle(5.0,5.0,3.0,3.0);

        for (int i = 0; i < 3; i++) {
            System.out.println(ha[i].toString());
        }
        
        for (Shape sh : ha) { 
            sh.translate(1.0, 1.0);  
        }

        for (Shape sh : ha) {
            System.out.println(sh);
        }
    }

    public static void trouble () {

        System.out.println("\nIn trouble . . .");

        Shape s1 = new Circle(0.0, 0.0, 1.0);

        s1.scale(3.4); 
        System.out.println(((Circle)s1).perimeter());
        
      
    }
}
