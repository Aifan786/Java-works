package Sprint1Day4;

public class Demo {

	Demo(){
		this("Hello");
		System.out.println("inside zero argument constructor Demo()");
	}
	
	 Demo(int i){
		this((float)50.5);
		System.out.println("inside one argument constructor Demo(int i)");
		}
	 Demo(float f){
		System.out.println("inside one argument constructor Demo(float f)");
		}
	 Demo(String s){
		//this(); //it will become recursive call
		 this(10);
		System.out.println("inside one(String) argument constructor Demo(String s)");
		}
	 
	public static void main(String[] args){
		
		Demo d1=new Demo();
	}
}
