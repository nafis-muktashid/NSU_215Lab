package homeWork_2;

public class main {

	public static void main(String[] args) {
		Point p = new Point(2.4, 4.2);
		Point p1 = new Point(5.5, 5.5);
		
		System.out.println(p.toString());
		
		p.translate(4.2, 2.4);
		
		System.out.println(p1.toString());
		
		System.out.println(p.toString());
		
		System.out.println(p.distanceTo(p1));

	}

}
