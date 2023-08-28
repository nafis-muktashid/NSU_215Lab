package homeWork_2;

import java.util.*;

public class Point {
	private double x;
	private double y;
	
	//constructor
	Point(double d1, double d2){
		this.x = d1;
		this.y = d2;
	}
	
	//Set Methods
	public void setX(double d) {
		this.x = d;
	}
	public void setY(double d) {
		this.y = d;
	}
	
	//Get Methods
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	//Calculate Distance
	public double distanceTo(Point p) {
		return Math.sqrt(Math.pow((p.x-this.x), 2)+Math.pow((p.y-this.y), 2));
	}
	
	//Translation of Points
	public void translate(double d1, double d2) {
		this.x = this.x+d1;
		this.y = this.y+d2;
	}
	
	//ToString Method
	public String toString() {
		return "X: " + this.x + "\tY: " + this.y;
	}
}
