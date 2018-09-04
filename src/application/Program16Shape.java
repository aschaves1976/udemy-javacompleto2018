package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle01;
import entities.Shape;
import entities.enums.Color;

public class Program16Shape {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int numOfShape = sc.nextInt();

		for (int i = 0; i < numOfShape; i++) {
			sc.nextLine();
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.nextLine());

			if (shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle01(color, width, heigth));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}

		}
		System.out.println("SHAPE AREAS & COLORS:");
		for (Shape sp : list) {
			System.out.print(sp.toString());
		}
		sc.close();
	}

}
