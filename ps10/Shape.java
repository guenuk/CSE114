//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public interface Shape {
    public abstract void translate (double dx, double dy);

    public abstract void scale (double factor);

    public abstract Box boundingBox ();
    
    public abstract double internalAngle ();
    
    public abstract double perimeter ();

}
