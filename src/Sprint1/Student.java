package Sprint1;

public class Student {

	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is: " + roll);
		System.out.println("Name is: " + name);
		System.out.println("Marks is: " + marks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 15;
		s1.name = "Karan";
		s1.marks = 82;
		s1.displayStudentDetails();
		s1 = null;
	    
		System.out.println("--------------");
		Student s2 = new Student();
		s2.roll = 20;
		s2.name = "Ramiz";
		s2.marks = 90;
		s2.displayStudentDetails();
		
//		System.out.println(s1.name);

		s2 = s1;
	    System.out.println(s2.name);
	}
}
