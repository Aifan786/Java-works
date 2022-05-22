package Sprint1Day5;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
//	private double netSalary;
	
	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getId() {
		return employeeId;
	}
	
	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getName() {
		return employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public void CalculateNetSalary(int pfpercentage) {
		double netSalary = salary-salary*pfpercentage/100;
		System.out.println("Net Salary:"+netSalary);
		
	}

}
