package S3D1_Abstraction_Interface;

public class Main_Shape {

	public static void main(String[] args) {
		
		Shape areaShape = new Area();		
//		Area area = (Area)areaShape;
//		area.hexagon();
		
		System.out.println("Area of rectangle is: "
		                   +areaShape.rectangleArea(5, 10)+" square meter.");
		System.out.println("Area of square is: "
                           +areaShape.squareArea(5)+" square meter.");
		System.out.println("Area of circle is: "
                           +areaShape.circleArea(15)+" square meter.");
	}
}
