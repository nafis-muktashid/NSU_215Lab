package homeWork_3;

public class Car {
	private String manufacturer;
	private String model;
	private int year;
	private double currentSpeed;
	
	//Constructor
	Car(String s, String s2, int i, double d){
		this.manufacturer = s;
		this.model = s2;
		this.year = i;
		this.currentSpeed = d;
	}
	
	//Get Methods
	public String getMake() {
		return this.manufacturer;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
	public double getCurrentSpeed() {
		return this.currentSpeed;
	}
	
	//Accelerate
	public void accelerate(double speedIncrese) {
		this.currentSpeed += speedIncrese;
	}
	
	//Brake
	public void brake(double speedDecrese) {
		this.currentSpeed -= speedDecrese;
	}
	
	//Display Info
	public void displayInfo() {
		System.out.println("Manufacturer \t:"+this.manufacturer);
		System.out.println("Model \t\t:"+this.model);
		System.out.println("Year \t\t:"+this.year);
		System.out.println("Current Speed \t:"+this.currentSpeed+"kmph");
		
	}
}
