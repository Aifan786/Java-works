package S2D2InheritanceAssingment;

public class MainMember {

	public static void main(String[] args) {
		
		Employee m1 = new Employee("aifn","123434","jharkhand",100000.0,"backend devlopper","Computer");
		m1.printDetails();
		
		System.out.println("--------------------------");
		
		Manager mn1 = new Manager("aifn","123434","jharkhand",100000.0,"backend devlopper","Computer");
		mn1.printDetails();
	}
	
}
