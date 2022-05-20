package Sprint1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//public class DemoA {
//
//	int x = 10;
//	A a1 = new A(); //Has-A relationship
//	
//	void funX() {
//		System.out.println("inside funX of Demo");
//	}
//	public static void main(String[] args) {
//		
//		DemoA d1 = new DemoA();
//		
//		
//		System.out.println(d1.x);
//		System.out.println(d1.a1);
//		
//		d1.a1.funA();
//	}
//}
public class DemoA {

	void fun1(A a1) {
		
		if(a1 != null) {
			System.out.println("inside fun1 of Demo");
			a1.funA();
		}
		else {
			System.out.println("Don't pass null value");
		}
		
	}
	
	public static void main(String[] args) {
		
		DemoA d1 = new DemoA();
		
		A obj = new A();
		d1.fun1(obj);
	}
}
