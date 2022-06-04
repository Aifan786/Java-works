package S3D2_Interface;

public interface X {

	void funA();
	
	default void funB() {
		System.out.println("Inside funB of interface X");
	}
	
	static void funC() {
		System.out.println("Inside funC of interface X");
	}
}
