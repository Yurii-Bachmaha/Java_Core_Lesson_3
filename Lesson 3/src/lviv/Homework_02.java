package lviv;

public class Homework_02 {

	public static void main(String[] args) {

		int length1 = 5;
		int width1 = 9;

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(length1, width1);

		System.out.println("Rectangle 1 area = " + r1.square());
		System.out.println("Rectangle 1 perimeter = " + r1.perimeter());
		System.out.println();
		System.out.println("Rectangle 2 area = " + r2.square());
		System.out.println("Rectangle 2 perimeter = " + r2.perimeter());
		System.out.println();

		double radius1 = 4.7;
		double diameter1 = radius1*2; 

		Circle c1 = new Circle();
		Circle c2 = new Circle(radius1, diameter1);

		System.out.println("Circle 1 area = " + c1.circleSquare());
		System.out.println("Circle 1 length = " + c1.circleLength());
		System.out.println();
		System.out.println("Circle 2 area = " + c2.circleSquare());
		System.out.println("Circle 2 length = " + c2.circleLength());
	}

}
