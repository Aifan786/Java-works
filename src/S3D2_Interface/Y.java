package S3D2_Interface;

public interface Y {

	void funD();
	
	default void funE() {
		System.out.println("Inside funB of interface Y");
	}
	
	static void funF() {
		System.out.println("Inside funF of interface Y");
	}
}
