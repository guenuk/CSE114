//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public class Circle implements Shape {

    public Point center;
    public double radius;

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle (double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    public void translate (double dx, double dy) {
        center.translate(dx, dy);
    }
    
    public void translateToFive () {
    	translate(5.0,5.0);
    }

    public void scale (double factor) {
        radius = radius * factor;
    }
    
    public double internalAngle() {
    	return -1.0;
    }

    public double perimeter () {
        return 2 * Math.PI * radius;
    }

    public Box boundingBox () {
        return (new Box(center.getX() - radius,
                        center.getY() - radius,
                        2.0 * radius,
                        2.0 * radius));
    }

    public String toString () {
        return
            "Circle:\n radius:   " + radius +
            "\n center: " + center +
            "\n BoundingBox: " + boundingBox();
    }

    // Use code (test code)
    //
    public static void main (String[] args) {

        Circle c1 = new Circle(0.0, 0.0, 10.0);
        System.out.println(c1);
        c1.translate(5.5, 7.5);
        c1.scale(3.0);
        System.out.println(c1);
        System.out.println("Circumference is: " + c1.perimeter());
    }
}
