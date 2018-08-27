package application;

import java.util.Random;
import java.util.Scanner;

public class ProgramEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int m = sc.nextInt();
		System.out.print("Enter other number: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];
		Random r = new Random();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = r.nextInt(100);
			}
		}

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Choose a number: ");
		int x = sc.nextInt();

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + ", " + j);
					System.out.println();
					if (i > 0) {
						System.out.println("Top:   " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down:  " + mat[i + 1][j]);
					}
					if (j > 0) {
						System.out.println("Left:  " + mat[i][j - 1]);
					}
				}
			}
			System.out.println();
		}

		sc.close();

	}

}
