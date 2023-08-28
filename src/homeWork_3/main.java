package homeWork_3;

public class main {

	public static void main(String[] args) {
		Car c = new Car("Nissan-Skyline", "R34", 2000, 100);
		
		c.displayInfo();
		System.out.println();
		
		c.accelerate(45.9);
		c.displayInfo();
		System.out.println();
		
		c.brake(30.4);
		c.displayInfo();

	}

}
