package S2D4Assingment;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	Student(){}
	
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	private  void calculateGrade() {
		if(marks>=500) {
			this.grade='A';
		}
		else if(marks<500 && marks>=400) {
			this.grade='B';
		}
		else {
			this.grade='C';
		}
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	

    public void displayDetails() {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter roll number");
    	int roll = sc.nextInt();
    	System.out.println("Enter name");
    	String name = sc.next();
    	System.out.println("Enter marks");
    	int marks = sc.nextInt();
    	
		Student s2 = new Student(roll,name,marks);
    	
		s2.calculateGrade();
		
		System.out.println(s2);
    }
	
}












