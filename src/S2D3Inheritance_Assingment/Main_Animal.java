package S2D3Inheritance_Assingment;

public class Main_Animal {

	public static void main(String[] args) {
		
//		Animal a1 = new Dog();
//		a1.makeNoise();
		
		Animal[] animal = {new Dog(), new Cat(), new Tiger()};
		
		for(int i=0; i<animal.length; i++) {
			
			animal[i].eat();
			animal[i].walk();
			animal[i].makeNoise();
		}
	}
}
