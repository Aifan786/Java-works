package S3D3Regular_Expressions;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {

	public static void main(String[] args) {
	    
		
		System.out.println("Enter the paragraph");
		
		Scanner object = new Scanner(System.in); 
		String input = object.nextLine(); 
		
		try {
			
			int count = 0;
			Pattern p = Pattern.compile("Java");
			Matcher m = p.matcher(input);
			
			while(m.find()) {
				
				count++;
				System.out.println(m.start()+"-------"+m.end()+"-------"+m.group());
			}
			System.out.println("The no. of occurrences is: "+count);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
	}
}
