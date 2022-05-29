package S2D4Assingment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 10");
		 int num = sc.nextInt();
		
		Child c = new Child();
		c.method1(num);

	}

}
