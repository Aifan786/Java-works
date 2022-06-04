package S3D2_Interface;

import java.util.Scanner;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	public void  searchOutdatedModel(String s, String... phone) {
		
		for(String str: outdatedModels) {
			
			for(String str2: phone) {
				
				if(str.equals(str2)) {
					
					System.out.println(str+"_OUTDATED");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
	    Mobile mobile = new Mobile();
	    mobile.searchOutdatedModel("Redmi","note4","note5","note10 lite","note7pro");

	}
}


