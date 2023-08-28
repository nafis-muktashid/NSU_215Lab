package homeWork_4;

public class Student {
	private String name;
	private int age;
	private String studentID;
	
	//Constructor
	Student(String s, int i, String s2){
		this.name = s;
		this.age = i;
		this.studentID = s2;
	}
	
	//Set Methods
	public void setName(String s) {
		this.name = s;
	}
	public void setAge(int i) {
		this.age = i;
	}
	public void setStudentID(String s) {
		this.studentID = s;
	}
	
	//Get Method
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getStudentID() {
		return this.studentID;
	}
	
	//Display Info
	public void displayInfo() {
		System.out.println("Name \t\t:"+this.name);
		System.out.println("Age \t\t:"+this.age);
		System.out.println("Student ID \t:"+this.studentID);
	}
}
