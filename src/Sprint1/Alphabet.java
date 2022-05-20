package Sprint1;

public class Alphabet {

	char alpha;
	void CheckCase() {
		if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U') {
			System.out.println("Vowels");
		}
		else if(alpha=='B'||alpha=='C'||alpha=='D'||alpha=='F'||alpha=='G'||
				alpha=='H'||alpha=='J'||alpha=='K'||alpha=='L'||alpha=='M'||
				alpha=='N'||alpha=='P'||alpha=='Q'||alpha=='R'||alpha=='S'||
				alpha=='T'||alpha=='V'||alpha=='W'||alpha=='X'||alpha=='Y'||
				alpha=='Z'){
			System.out.println("Consonant");
		}
		else {
			System.out.println("Error message");
		}
	}
	public static void main(String[] args) {
		
		Alphabet a1 = new Alphabet();
		a1.alpha = 'E';
		a1.CheckCase();
		
		Alphabet a2 = new Alphabet();
		a2.alpha = 'K';
		a2.CheckCase();
		
		Alphabet a3 = new Alphabet();
		a3.alpha = '#';
		a3.CheckCase();
	}
}
