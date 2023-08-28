package homeWork_1;

public class Box {
	private double length;
	private double width;
	private double height;
	
	//Constructor
	Box(double d1, double d2, double d3){
		this.length = d1;
		this.width = d2;
		this.height = d3;
	}
	
	//Set Methods
	public void setLen(double d) {
		this.height = d;
	}
	public void setWid(double d) {
		this.width = d;
	}
	public void setHei(double d) {
		this.height = d;
	}
	
	//Get Methods
	public double getLen() {
		return this.length;
	}
	public double getWid() {
		return this.width;
	}
	public double getHei() {
		return this.height;
	}
	
	//Cal Volume Method
	public double calculateVolume() {
		return this.length*this.width*this.height;
	}
	
	//Cal Surface Area Method
	public double calculateSurfaceArea() {
		return 2*(this.length*this.width + this.length*this.height + this.height*this.width);
	}
}
