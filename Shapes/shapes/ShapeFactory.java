package shapes;

public interface ShapeFactory {
	public static Circle createCircle(int radius) {
		return new Circle(radius);
	}

	public static Rectangle createRectangle(int width, int height) {
		return new Rectangle(width, height);
	}

	public static Square createSquare(int sLength) {
		return new Square(sLength);
	}

	public static Triangle createTriangle(int width, int height) {
		return new Triangle(width, height);
	}
}