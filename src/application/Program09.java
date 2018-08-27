package application;

import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main Diagonal");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					cnt++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + cnt);

		sc.close();
	}

}
