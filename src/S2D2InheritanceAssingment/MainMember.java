package S2D2InheritanceAssingment;

public class MainMember {

	public static void main(String[] args) {
		
		Employee m1 = new Employee("Anurag","8676575767","jharkhand",100000.0,"Backend devloper","Computer");
		m1.printDetails();
		
		System.out.println("--------------------------");
		
		Manager mn1 = new Manager("Hassan","7567477575","jharkhand",70000.0,"Frontend devloper","Computer");
		mn1.printDetails();
	}
	
}
