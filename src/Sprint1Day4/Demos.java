package Sprint1Day4;

public class Demos {

	public static void main(String[] args){
		
		//using zero argument constructor
		Student student1 = new Student();
		student1.setRoll(16);
		student1.setName("Ram");
		student1.setAge(20);
		student1.setMarks(350);
		
		
		//using parameterized constructor
		System.out.println("Student1 details: ");
		student1.showDetails();
//		
		Student student2 = new Student(18, "Ramesh", 25, 400);
		
		System.out.println("-------------------");
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
	}
	
}
