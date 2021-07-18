package shapes;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		double area = this.width * this.height;
		return area;
	}

	public String getName() {
		String name = "Rectangle";
		return name;
	}
}