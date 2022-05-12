//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;

public class Rectangle implements Shape {

    public Point llcorner;
    public double width;
    public double height;

    public Rectangle (double neww, double newh) {
        llcorner = new Point();
        width = neww;
        height = newh;
    }

    public void translate (double dx, double dy) {
        llcorner.translate(dx,dy);
    }
    
    public double perimeter() {
    	return width*2 + height*2;
    }

    public void scale (double factor) {
        width = width * factor;
        height = height * factor;
    }

    public double internalAngle () {
    	return 360.0;
    }
    
    public double diagonal () {
        return Math.sqrt((width * width) + (height * height));
    }

    public Box boundingBox () {
        return (new Box(llcorner.getX(), llcorner.getY(), width, height));
    }

    public String toString () {
        return
            "Rectangle:\n width:   " + width +
            "\n height: " + height +
            "\n llcorner: " + llcorner +
			"\n BoundingBox: " + boundingBox();
    }

    // Use code (test code)
    //
    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(10.0, 20.0);
        System.out.println(r1);
        r1.translate(5.0, 6.0);
        r1.scale(2.0);
        System.out.println(r1);
        System.out.println("Diagonal is: " + r1.diagonal());
    }
}

