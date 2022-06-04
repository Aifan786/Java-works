package S3D3Regular_Expressions;

public class Citizen {

	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	void printDetails() {
		System.out.println("User name is: "+getName());
		System.out.println("User Aadhar no. is: "+getAadharNumber());
		System.out.println("User Mobile no. is: "+getMobileNumber());
	}
}
