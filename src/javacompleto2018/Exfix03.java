package javacompleto2018;

import java.util.Arrays;
import java.util.Scanner;

public class Exfix03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 3 números aleatórios(na mesma linha)");
		int n1 = (int) sc.nextDouble();
		int n2 = (int) sc.nextDouble();
		int n3 = (int) sc.nextDouble();

		int[] vector = { n1, n2, n3 };
		Arrays.sort(vector);

		System.out.println("Maior Valor informado: " + vector[vector.length - 1]);

	}

}
