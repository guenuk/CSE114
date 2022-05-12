//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public class SportsCar extends Car implements Comparable<Car>{
	private int maxSpeed;
	private int seconds;
	private boolean isConvertible;

	public SportsCar(String make, String model, int year, String color, String owner, int numRepairs, int maxSpeed, int seconds, boolean isConvertible){
		super(make, model, year, color, owner, numRepairs);
		this.maxSpeed = maxSpeed;
		this.seconds = seconds;
		this.isConvertible = isConvertible;
	}

	public boolean isSnazzy(){
		return maxSpeed>150 && isConvertible &&
				(color.equals("red")||color.equals("purple")||color.equals("yellow"));
	}

	public static void main(String[]args){
		Car c1 = new SportsCar("Ferrari", "Spider", 2018, "red", "Geunuk", 0, 200, 3, true);
		Car c2 = new SportsCar("Lamborghini", "Urus", 2019, "black", "Geunuk", 1, 300, 4, false);
		System.out.println("NEW CARS!! \nCar1's info:" + c1 + "\nCar2's info:"+ c2);
		System.out.println("Now comparing Car1 and Car2's MaxSpeed with ComapreTo(). . . ");
		int i = ((SportsCar) c1).compareTo(c2);
		if (i==1) {
			System.out.println("Car 1 is faster!");
		}
		else if (i==0) {
			System.out.println("They are Same!");
		}
		else {
			System.out.println("Car 2 is faster");
		}


	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getSeconds() {
		return seconds;
	}
	public boolean getIsConvertible() {
		return isConvertible;
	}
	public String toString() {
		return "\nBrand: " + make +
				"\nModel: " + model + 
				"\nYear: " + year + 
				"\nColor: "+ color + 
				"\nOwner: " + owner + 
				"\nNumber of repairs: " +numRepairs + 
				"\nMax speed: "+ maxSpeed + 
				"\nZero to 100miles/h: " + seconds + 
				"\nIs Convertible?: "+ isConvertible;
	}

	public int compareTo(Car c) {
		// TODO Auto-generated method stub
		if(this.maxSpeed > ((SportsCar) c).getMaxSpeed()) {
			return 1;
		}
		else if(this.maxSpeed == ((SportsCar) c).getMaxSpeed()){
			return 0;
		}
		else {
			return -1;
		}
	}
}
