import shapes.*;
import java.util.*;

public class ShapeTester {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList();
		shapes.add(ShapeFactory.createCircle(3));
		shapes.add(ShapeFactory.createRectangle(6, 12));
		shapes.add(ShapeFactory.createTriangle(6, 6));
		shapes.add(ShapeFactory.createRectangle(1, 2));
		shapes.add(ShapeFactory.createSquare(10));
		shapes.add(ShapeFactory.createRectangle(2, 8));
		shapes.add(ShapeFactory.createSquare(9));
		shapes.add(ShapeFactory.createCircle(5));
		shapes.add(ShapeFactory.createTriangle(3, 9));
		shapes.add(ShapeFactory.createSquare(3));
		shapes.add(ShapeFactory.createTriangle(9, 2));
		shapes.add(ShapeFactory.createCircle(4));
		System.out.println("Before sorting:");
		for (int x = 0; x < shapes.size(); x++) {
			System.out.println("\tThe area of the " + shapes.get(x).getName() + " is " + shapes.get(x).area() + ".");
		}
		Collections.sort(shapes);
		System.out.println("\nAfter sorting:");
		for (int x = 0; x < shapes.size(); x++) {
			System.out.println("\tThe area of the " + shapes.get(x).getName() + " is " + shapes.get(x).area() + ".");
		}
	}
}