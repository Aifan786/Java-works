package ZPractise;

import java.util.Objects;

public class Student {

	private String name;
	private int roll;
	private int marks;
	
	
    Student(String name, int roll, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}


	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
}
