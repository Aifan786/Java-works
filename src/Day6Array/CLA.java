package Day6Array;

public class CLA {

	public static void main(String[] args) {
		
		if(args.length>=3) {
			System.out.println("Error");
		}
		else if(args.length==2) {
			
			
			int diff = Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
			int fact = 1;
			
			for(int i=1; i<=diff; i++) {
				fact*=i;
			}
			System.out.println(fact);
		}
		else {
			int fact = 1;
			for(int i=1; i<=Integer.parseInt(args[0]); i++) {
				fact*=i;
			}
			System.out.println(fact);
		}
	}
}
