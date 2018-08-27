package application;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int n1 = sc.nextInt();
		sc.nextLine();

		System.out.printf("informe a altura de %d pessoas:%n", n1);
		double[] height = new double[n1];
		for (int i = 0; i < height.length; i++) {
			height[i] = sc.nextDouble();
		}
		double averageHeight = 0;
		for (double db : height) {
			averageHeight += db;
		}
		averageHeight = averageHeight / height.length;

		System.out.printf("AVERAGE HEIGHT: %.2f", averageHeight);
		sc.close();
	}

}
