package S2D4Assingment;

public class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("eating bread...");
	}

//specific method of child class
	void bark() {
		System.out.println("barking...");
	}
}

