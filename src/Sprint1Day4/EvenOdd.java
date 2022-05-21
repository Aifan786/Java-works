package Sprint1Day4;

public class EvenOdd {

int num;
	
	void numberType() {
		
		if(num<0) {
			System.out.println("Error");
		}
		else if(num%2!=0) {
			System.out.println(num);
		}
		else {
			for(int i=1; i<=10; i++) {
				if((num+i)%10==0) {
					System.out.println(num+i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		EvenOdd n1 = new EvenOdd();
		n1.num = -62;
		
		n1.numberType();
	}
}
