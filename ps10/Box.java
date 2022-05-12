//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;

public class Box {

    private double xpos;
    private double ypos;
    private double width;
    private double height;

    public Box (double x, double y, double w, double h) {
        xpos = x;
        ypos = y;
        width = w;
        height = h;
    }

    public String toString () {
        return
            "BBox (x: " + xpos +
            ", y: " + ypos +
            ", w: " + width +
            ", h: " + height + ")";
    }

}
