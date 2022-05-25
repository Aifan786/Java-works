package Day6Array;

public class PrimeNumber {

	public void primeNumber(int[] array){
		
		int C = 0;
		
		for(int i=0; i<array.length; i++) {
			int count = 0;
			
			for(int j=1; j<=array[i]; j++) {
				if(array[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(array[i]+" "+"Prime number");
			}
			else {
				C++;
			}
		}
		if(C==array.length) {
            System.out.println("Prime number not found in the supplied Array");
		}
	}
	
	public static void main(String[] args) {
		
		PrimeNumber p1 = new PrimeNumber();
		
		int[] arr = new int[5];
		arr[0] = 4;
		arr[1] = 6;
		arr[2] = 2;
		arr[3] = 8;
		arr[4] = 13;
		
		p1.primeNumber(arr);
	}
}
