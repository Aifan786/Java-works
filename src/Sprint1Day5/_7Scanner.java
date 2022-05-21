package Sprint1Day5;

import java.util.Scanner;

public class _7Scanner {
    public static void main(String[] args) {
        //one timer
      Scanner sc =new Scanner(System.in);
      
        System.out.println("Y are above 18?");
        boolean areYou18Plus=sc.nextBoolean();
        System.out.println(areYou18Plus);

        System.out.println("enter temprature");
        Double temp=sc.nextDouble();
        System.out.println(temp);

//        sc.nextLine();
        System.out.println("enter a sentence");

        String line=sc.nextLine();
        System.out.println(line);


    }
}
