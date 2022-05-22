package Sprint1Day5Live;

public class StringDemo {

	public static void main(String[] args) {
		
		//1. String Literal - stored in String pool
		
//		String s = "myString";
//		String s1 = "anotherString";
//		String s2 = "anotherString";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s);

//		String s3= new String("three");
//        String s4= new String("three");
//        System.out.println(s3==s4);
		
		 StringBuilder builder=new StringBuilder("Welcome");
	        builder=builder.append("1");
//	        System.out.println(builder);
//	        System.out.println(builder.append("2"));
	        
	        
//	        System.out.println(builder.toString());
	        
	        System.out.println(" abc def ".trim());
	        System.out.println("ab4g".replace('4','y'));
	        
	        String s5 = "012356789";
	        char[] array=s5.toCharArray();
	        for(int i=0;i<array.length;i++){
	            System.out.println(array[i]);
	        }

	}
}
