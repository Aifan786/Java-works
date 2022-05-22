package Sprint1Day5;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setId(402);
		e1.setName("Manish");
		e1.setSalary(20000);
		
		System.out.println("Id:"+ e1.getId());
		System.out.println("Name:"+ e1.getName());
		System.out.println("Salary:"+ e1.getSalary());
		e1.CalculateNetSalary(7);
//		System.out.println("Net Salary:"+e1.calculateNetSalary(7) );
	}
}
