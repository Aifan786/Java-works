package S2D4Assingment;

import java.util.Scanner;

public class Parent {
	
	public void method1(int N) {
		
		System.out.println("method1 belongs to Parent class");
		final int number=N;
		System.out.println("Number is: "+number);
	}

	final void method2() {
		System.out.println("method2 belongs to Parent class");

	}

	public void method3() {
		System.out.println("method3 belongs to Parent class");
	} 
}

final class Child extends Parent{
	
	public void method1(int n) {
		if(n>1 && n<10) {
			new Parent().method1(n);
			new Parent().method2();
			new Parent().method3();
			method4();
		}
		else {
			System.out.println("Invalid number");
		}
	}
	public void method4() {
		System.out.println("method4 belongs to Child class");
	}
	
}


