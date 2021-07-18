package shapes;

public abstract class Shape implements Comparable<Shape> {
	public abstract double area();

	public abstract String getName();

	public int compareTo(Shape shape) {
		if (this.getName().equals(shape.getName())) {
			double area = this.area() - shape.area();
			return (int) area;
		}
		return this.getName().compareTo(shape.getName());
	}
}