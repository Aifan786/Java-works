package Sprint1Day4;

public class CollegeStudent {

	private int Roll;
	private String Name;
	private String Address;
	private String College;
	static String CollegeNameString;
	
	static boolean bln;
	
	public CollegeStudent() {
		
	}
	
	public CollegeStudent(int roll, String name, String address) {
		this.Roll = roll;
		this.Name = name;
		this.Address = address;
		CollegeNameString = "NIT";
	}
	
	public CollegeStudent(int roll, String name, String address, String college) {
		this.Roll = roll;
		this.Name = name;
		this.Address = address;
		this.College = college;
	}
	
	public void setStudent(boolean b) {
		bln=b;
	}
	
	public boolean getStudent() {
		return bln;
	}
	
	public void showDetails() {
		
		System.out.println("Roll is:" +" "+Roll);
		System.out.println("Name is:" +" "+ Name);
		System.out.println("Address is:" +" "+ Address);
		System.out.println("College name is:" +" "+CollegeNameString);
	}
	
    public void showDetails2() {
		
		System.out.println("Roll is:" +" "+Roll);
		System.out.println("Name is:" +" "+ Name);
		System.out.println("Address is:" +" "+ Address);
		System.out.println("College name is:" +" "+College);
	}
}
