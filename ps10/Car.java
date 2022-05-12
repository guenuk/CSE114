//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public class Car {
	protected String make;
	protected String model;
	protected int year;
	protected String color;
	protected String owner;
	protected int numRepairs;

	public Car(String make, String model, int year, String color, String owner, int numRepairs){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.owner = owner;
		this.numRepairs = numRepairs;
	}

	public void sellTo(String newOwner){
		owner = newOwner;
	}

	public void repair(){
		numRepairs +=1;
	}

	public boolean isReliable(){
		return (numRepairs/(2019-year))<=1;
	}

	public static void main(String[]args){
		Car c1 = new Car("Volvo", "XC90", 2018, "White", "Art Lee", 0);
		Car c2 = new Car("Volvo", "XC80", 2016, "Silver", "Art Lee", 5);
		System.out.println("NEW CARS!! \nCar1's info:" + c1 + "\nCar2's info:"+ c2 +"\n");
		c1.sellTo("Geunuk");
		c1.repair();
		c1.repair();
		System.out.println("Car1 just got sold to 'Geunuk', repaired twice afterwards.");
		System.out.println("Is Car1 and Car 2 reliable?"
				+ "\n checking Car1 . . . "
				+ c1.isReliable() 
				+ "\n checking Car2 . . . "
				+ c2.isReliable());
	}
	public String toString() {
		return "\nBrand: " + make +
				"\nModel: " + model + 
				"\nYear: " + year + 
				"\nColor: "+ color + 
				"\nOwner: " + owner + 
				"\nNumber of repairs: " +numRepairs;
	}

}
