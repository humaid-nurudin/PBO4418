public class TestSimpleCircle {
	/** main method */
	public static void main(String[] args) {
		// Create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("the area of the circle of radius "
			+ circle1.radius + "is" + circle1.getArea());

		// Create a circle with radius 25
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("the area of the circle of radius "
			+ circle2.radius + "is" + circle2.getArea());

		// Create a circle with radius 125
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("the area of the circle of radius "
			+ circle3.radius + "is" + circle3.getArea());

		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("the area of the circle of radius "
			+ circle2.radius + "is" + circle2.getArea());
	}
}

class SimpleCircle {
	/** the radius of this circle */
	double radius = 1;

	/** declare a constanta */
	final double PI = 3.14159;

	/** construct a circle with radius 1 */
	SimpleCircle() {
		radius = 1;
	}

	/** construct a circle with specified radius */
	SimpleCircle(double newRadius) {
		radius = newRadius;
	}

	/** return the area of this circle */
	double getArea() {
		return radius * radius * PI;
	}

	/** return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * PI;
	}

	/** set new radius for this circle */
	double setRadius(double newRadius) {
		return radius = newRadius;
	}
}