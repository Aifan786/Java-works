//package S2D1Array;
//
//public class Greater {
//
//	public int greaterElement(int[] arr){
//
//		int max = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		
//		return max;
//	}
//	
//	public static void main(String[] args) {
//		
//		Greater g = new Greater();
//		
//		int[] array = new int[3];
//		array[0] = 5;
//		array[1] = 15;
//		array[2] = 10;
//
//		int large = g.greaterElement(array);
//		System.out.println(large);
//	}
//
//}

package S2D1Array;

public class Greater {

	int[] arr = new int[3];
	int m;
	int k = 0;
	int max = 0;
	
	public Greater() {};
	
	public Greater(int n){
		this.m = n;
		arr[k] =m ;
//		System.out.println(arr[k]);
		k++;
	}
	
	public int greaterElement() {
		
		for(int i=0 ;i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Greater[] g = new Greater[5];
		
		Greater g1 = new Greater(5);
		Greater g2 = new Greater(15);
		Greater g3 = new Greater(10);

		int num = g3.greaterElement();
		System.out.println(num);
	}

}
























