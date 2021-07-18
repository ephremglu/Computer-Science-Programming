package shapes;

public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public String getName() {
		String name = "Circle";
		return name;
	}
}