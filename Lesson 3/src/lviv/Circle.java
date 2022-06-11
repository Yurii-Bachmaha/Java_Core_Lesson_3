package lviv;

public class Circle {

	private double radius;
	private double diameter;

	Circle() {
		this.radius = 3.3;
		this.diameter = radius * 2;
	}

	Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}

	public double circleSquare() {
		return diameter * diameter / 4 * 3.14;
	}

	public double circleLength() {
		return 2 * 3.14 * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}

}
