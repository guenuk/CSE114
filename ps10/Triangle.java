//Geunuk Na, geunuk.na@stonybrook.edu
//Triangles that created are all Right triangle in this class.
package hw10;
public class Triangle implements Shape{

	public Point corner;
	public double width;
	public double height;

	public Triangle (double x, double y, double width, double height){
		this.corner = new Point(x,y);
		this.width = width;
		this.height = height;
	}

	public void translate (double dx, double dy){
		corner.translate(dx,dy);
	}

	public double perimeter (){
		return Math.sqrt(Math.pow(width,2)+(Math.pow(height,2)));
	}

	public void scale (double factor){	
		width *= factor;
		height *= factor;
		corner.scale(factor);
	}

	public double internalAngle (){
		return 180.0;
	}

	public Box boundingBox (){
		return (new Box(corner.getX(), corner.getY(), width, height));
	}

	public String toString (){
		return
				"Triangle:\n width:   " + width +
				"\n height: " + height +
				"\n corner: " + corner +
				"\n BoundingBox: " + boundingBox();
	}
}
