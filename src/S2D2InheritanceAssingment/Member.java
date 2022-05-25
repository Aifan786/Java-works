package S2D2InheritanceAssingment;

public class Member {
	
	String Name;
	String phoneNumber;
	String Address;
	double Salary;

	public void printDetails() {
		System.out.println(Name);
		System.out.println(phoneNumber);
		System.out.println(Address);
		System.out.println(Salary);
		
	}

	
}

	class Employee extends Member {
		String Specialisation;
		String Department;
		Employee(String name,String phone,String Address,double salary,String spc,String dep){
			this.Salary=salary;
			this.Address=Address;
			this.phoneNumber=phone;
			this.Name=name;
			this.Specialisation=spc;
			this.Department=dep;
			
		}

		

		@Override
		public void printDetails() {

			super.printDetails();
		}
	}

	class Manager extends Member {
		String Specialisation;
		String Department;
		Manager(String name,String phone,String Address,double salary,String spc,String dep){
			this.Salary=salary;
			this.Address=Address;
			this.phoneNumber=phone;
			this.Name=name;
			this.Specialisation=spc;
			this.Department=dep;
			
		}

		@Override
		public void printDetails() {

			super.printDetails();
		}
	}
