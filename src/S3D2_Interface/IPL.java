package S3D2_Interface;

import java.util.Scanner;

public class IPL {

	public void homeTeamStadium(Stadium stadium) {
		
		switch (stadium) {
		
			case EDEN_GARDENS_STADIUM:
				System.out.println("This is the home ground of KKR");
				break;
			case WANKHEDE_STADIUM:
				System.out.println("This is the home ground of Mumbai Indians");
				break;
			case CHIDAMBARAM_STADIUM:
				System.out.println("This is the home ground of CSK");
				break;
			case M_CHINNASWAMY_STADIUM:
				System.out.println("This is the home ground of RCB");
				break;
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter stadium name");
		
		Scanner sc = new Scanner(System.in);
		String stadium_name = sc.next();
		
		IPL ipl = new IPL();
		
		try {
			Stadium stadium=Stadium.valueOf(stadium_name);
	
			ipl.homeTeamStadium(stadium);
		}
		catch (Exception e) {
			 
			System.out.println("Enter valid stadium");
		}
	}
}




