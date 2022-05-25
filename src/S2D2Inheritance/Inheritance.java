package S2D2Inheritance;

public class Inheritance {

	public static void main(String[] args) {
        Monkey monkey=  new Monkey();
        monkey.move();
        Cat cat = new Cat();
        cat.move();
    }
}

 class PetAnimal{
    public void move(){
        System.out.println("move");
    }
}
class Monkey extends PetAnimal{
    @Override
    public void move(){
        System.out.println("move - jump");
    }
}
class Cat extends PetAnimal{
    @Override
    public void move(){
        System.out.println("move -  slowly");
    }
}


