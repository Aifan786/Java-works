package Day6Array;

public class EvenSumColumns {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{3,4,5},
				{6,7,8}
		};
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			
			for(int j=0; j<arr.length; j++) {
				
				if(arr[j][i]%2==0) {
					sum=sum+arr[j][i];
				}
			}
			System.out.println(sum);
		}
	}
}
