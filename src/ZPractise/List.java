package ZPractise;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class List {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
//		Student student = new Student("ram",21,550);
		al.add(new Student("ram",21,550));
		al.add(new Student("sam",20,450));
		al.add(new Student("ram",21,550));
		al.add(new Student("aman",5,400));
		
		LinkedHashSet<Student> lhs = new LinkedHashSet<>(al);
		System.out.println(lhs);
	}
}

