package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(sc.nextDouble());
		rectangle.setWidth(sc.nextDouble());
		System.out.println();
		System.out.println(rectangle);

	}

}
