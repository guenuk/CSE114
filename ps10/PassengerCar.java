//Geunuk Na, geunuk.na@stonybrook.edu
package hw10;
public class PassengerCar extends Car implements Comparable<Car>{

	private int numPassengers;
	private int numDoors;
	private String transmissionType;

	public PassengerCar(String make, String model, int year, String color, String owner, int numRepairs, int numPassengers, int numDoors, String transmissionType){
		super(make, model, year, color, owner,numRepairs);
		this.numPassengers = numPassengers;
		this.numDoors = numDoors;
		this.transmissionType = transmissionType;
	}

	public boolean isComfortable(){
		return (numPassengers>4 && numDoors>3) && year<5;
	}

	public boolean isHardToDrive(){
		return transmissionType.equals("Manual");
	}

	public static void main(String[]args){
		Car c1 = new PassengerCar("Hyundai", "Genesis", 2017, "black", "Geunuk", 3, 5, 4, "auto");
		Car c2 = new PassengerCar("Kia", "Sportage", 2016, "white", "Geunuk", 4, 7, 4, "auto");
		System.out.println("NEW CARS!! \nCar1's info:" + c1 + "\nCar2's info:"+ c2);
		System.out.println("Now comparing Car1 and Car2's TransmissionType with CompareTo(). . . ");
		int i = ((PassengerCar) c1).compareTo(c2);
		if (i==1) {
			System.out.println("Car 1 is Easier");
		}
		else if (i==0) {
			System.out.println("They are Same!");
		}
		else {
			System.out.println("Car 2 is Easier!");
		}

	}

	public String getTMT() {
		return transmissionType;
	}
	public String toString() {
		return "\nBrand: " + make +
				"\nModel: " + model + 
				"\nYear: " + year + 
				"\nColor: "+ color + 
				"\nOwner: " + owner + 
				"\nNumber of repairs: " +numRepairs + 
				"\nNumber of Passengers: "+ numPassengers + 
				"\nNumber of Doors: " + numDoors + 
				"\nTransmission Type: "+ transmissionType;
	}

	@Override
	public int compareTo(Car c) {
		if(this.transmissionType.equals("auto") && ((PassengerCar) c).getTMT().equals("manual") ) {
			return 1;
		}
		else if(this.transmissionType.equals("auto") && ((PassengerCar) c).getTMT().equals("auto") ) {
			return 0;
		}
		else{
			return -1;
		}

	}
}
