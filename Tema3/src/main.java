import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class main {
	public static void main(String[] args) throws  Exception {
		Scanner x = new Scanner(System.in);

		List<Shape> shape = new ArrayList<>();
		try {
			shape.add(new Circle("#FF0000", 3, 3));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Square("#FF0000", 4, 4));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Rectangle("#FF0000", 5, 5, 10));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.print("Drawing mode : m or a ");
		String y = x.nextLine();
		switch (y) {
		case "a":
			for (Shape s : shape) {
				System.out.println("Details :" + s.getName() + "," + s.getArea() + "cm^2," + s.getBorderWidth() + "px,"
						+ s.getHexFillColor());
				s.draw();
				System.out.println();
			}
			break;
		case "m":
			System.out.println("Choose between : Square(S) , Rectangle (R) or Circle(c) " );
			String z = x.nextLine();
			switch (z) {

			case "S":

				for (Shape s : shape) {
					if (s.getName() == "Square") {
						System.out.println(s.getName() + "," + s.getArea() + " cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			case "R":
				for (Shape s : shape) {
					if (s.getName() == "Rectangle") {
						System.out.println(s.getName() + "," + s.getArea() + " cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			case "C":

				for (Shape s : shape) {
					if (s.getName() == "Circle") {
						System.out.println(s.getName() + "," + s.getArea() + " cm^2," + s.getBorderWidth() + "px,"
								+ s.getHexFillColor());
						s.draw();
					}
				}
				break;

			}
		}
	}

}
