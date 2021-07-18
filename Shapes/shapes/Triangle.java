package shapes;

public class Triangle extends Shape {
	private int width;
	private int height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		double area = (this.width * this.height) / 2;
		return area;
	}

	public String getName() {
		String name = "Triangle";
		return name;
	}
}