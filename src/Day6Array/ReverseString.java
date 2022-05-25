package Day6Array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		
//		int lenArray = sc.nextInt();
//		
//		int[] arr = new int[lenArray];
//		
//		for(int i=0; i<lenArray; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		String str = sc.next();
		char charArray[] = str.toCharArray();
		

		char ch;
		String newString = "";
		
		for(int i=charArray.length-1; i>=0; i--) {
			ch = str.charAt(i);
			newString = newString+ch;
		}
		System.out.println(newString);
	}
}
