package S4D3ArrayList;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an email");
//		String email = sc.next();
//		
//		System.out.println(Pattern.matches("[A-Za-z0-9_.-]+@[A-Za-z0-9_.-]+", email));
		
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("hello");
		al.add("bye");
		al.add(1, "hii");
		al.add("why");
		
//		System.out.println(al.size());
//		System.out.println(al);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		
	}
}















