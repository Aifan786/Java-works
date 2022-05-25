package Inheritance_PreClass;

public class Dog extends Animal{

//	void display() {
//		System.out.println("My age is:"+age);
//	}
	
	@Override
	void eat() {
		System.out.println("Dog can eat...");
	}
	
	void display() {
		System.out.println("My age is:"+age);
		super.eat();
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.eat();
		d.age = 2;
		d.display();
	}
}
