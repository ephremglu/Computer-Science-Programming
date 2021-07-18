package shapes;

public class Square extends Shape {
	private int sLength;

	public Square(int sLength) {
		this.sLength = sLength;
	}

	public double area() {
		double area = this.sLength * this.sLength;
		return area;
	}

	public String getName() {
		String name = "Square";
		return name;
	}
}