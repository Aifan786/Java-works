package Day6Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		
		String str = sc.next();
		
		char charArray[] = str.toCharArray();

		char ch;
		String newString = "";
		
//		System.out.println(charArray);
//		System.out.println(Arrays.toString(charArray));  //convert in an array format
		
		for(int i=charArray.length-1; i>=0; i--) {
			ch = str.charAt(i);
			newString+= ch;
		}
		System.out.println(newString);
	}
}
