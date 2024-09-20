package encapsulation;

//Write a Java program to create a class called Student with private instance variables student_id, student_name, and 
//grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. 
//However, provide a method called addGrade() that allows adding a grade to the grades variable while performing 
//additional validation.


public class Student {

	private int id;
	private String name;
	private double grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
		
	}
	public void addGrade(double grade) {
		System.out.println("The grade is published ");
	}
}
