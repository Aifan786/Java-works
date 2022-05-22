package Sprint1;

//public class DemoC {
//
//	int y = 10; //instance diff object have diff copy
//	
//	static int i = 100; 
//	
//	public static void main(String[] args) {
//		
//		DemoC d1 = new DemoC();
//		
//		d1.y = 500;
//		d1.i = 600;
//		
//		DemoC d2 = new DemoC();
//		
//		System.out.println(d2.y);//10
//		System.out.println(d2.i);//600
//		
//		DemoC d3 = new DemoC();
//	}
//}


//Polymorphism(method overloading)

public class DemoC {
	
	void fun1(float f, int i) {
		System.out.println("inside fun1 of Demo");
	}
	
	void fun1(int i, float f) {
		System.out.println("inside fun1(int i) of Demo");
	}
	
	public static void main(String[] args) {
		
		DemoC d1 = new DemoC();
		
		d1.fun1(25,10.0f);
		
//		d1.fun1(10, 10);
	}
}







