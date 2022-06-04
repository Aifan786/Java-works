package S2D4Assingment;

public class Animal_Main {

	void doSomething(Animal a) {
		a.eat();
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.bark();
		}
	}

	public static void main(String args[]) {
		Animal_Main main = new Animal_Main();
		main.doSomething(new Animal());
		main.doSomething(new Dog());
	}
}
