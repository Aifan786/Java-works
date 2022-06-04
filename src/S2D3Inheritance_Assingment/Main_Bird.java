package S2D3Inheritance_Assingment;

public class Main_Bird {

	public static void main(String[] args) {
		
	    Bird b1 = new Parrot();  //Super class ref-child class object OR 
	                                                       //object upcasting
		b1.fly();
		
		Parrot p1 = (Parrot)b1;  //Object downcasting
		p1.sing();
	}
}
