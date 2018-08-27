package javacompleto2018;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println(" ****** INICIO OPERADORES BITWISE ****** ");
		int n1 = 89;
		int n2 = 60;

		char l1 = 'Q';
		char l2 = 'q';

		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		System.out.println(l1 & l2);
		System.out.println(l1 | l2);
		System.out.println(l1 ^ l2);

		System.out.println(" ****** FIM OPERADORES BITWISE ****** ");

		int a1 = 10;
		int b1 = a1++;

		System.out.println(a1);
		System.out.println(b1);
		int c1 = ++b1;
		System.out.println(c1);

		double a = 1.0, b = -3.0, c = -4.0;
		// representar a fórmula de bascara.
		// raiz quadrada utiliza Math.sqrt(arg0)
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		System.out.printf(
				"Resultado da Fórmula de Báscara para os seguintes valores:%n a = %.2f%n b = %.2f%n c = %.2f%n%nResultado: %.2f%n%n",
				a, b, c, x1);

		char gender = 'F';
		double balance = 10.98277346;
		int age = 32;
		String name = "Maria";

		System.out.printf("Representação no formato default da máquina%n  %.2f%n", balance);
		System.out.printf("  %.5f%n", balance);

		Locale.setDefault(Locale.US);
		System.out.printf("-------%nRepresentação no Formato Americano%n  %.2f%n", balance);
		System.out.printf("  %.5f%n", balance);

		System.out.printf("%n%s is %d years old, gender %c and got %.2f bitcoins%n.", name, age, gender, balance);

	}

}
