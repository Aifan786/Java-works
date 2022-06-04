package S3D1_Abstraction_Interface;

abstract  class Shape {
	
	abstract int rectangleArea(int length, int breadth);
	abstract int squareArea(int side);
	abstract int circleArea(int radius);
}

class Area extends Shape{

	@Override
	int rectangleArea(int length, int breadth) {
		
		return length*breadth;
	}

	@Override
	int squareArea(int side) {

		return side*side;
	}

	@Override
	int circleArea(int radius) {

		return (int) (3.14*radius*radius);
	}
	
}
