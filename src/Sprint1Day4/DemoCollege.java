package Sprint1Day4;

public class DemoCollege {

	public static void main(String[] args) {
		
		CollegeStudent check = new CollegeStudent();
		check.setStudent(false);
		
		if(check.getStudent()==true) {
			
//			System.out.println("Belong from NIT college");
			CollegeStudent details1 = new CollegeStudent(1201, "Aman", "Karam Lane Hyderabad");
			details1.showDetails();
		}
		else {
			CollegeStudent details2 = new CollegeStudent(2505, "Arman", "Panna Lane Bengaluru", "BIT");
			details2.showDetails2();
		}
	}
}
