package javacompleto2018;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.next().charAt(0); // pegando apenas um caracter
		// Armazenando dados de um código alfanumerico de duas posições - b5
		String s2 = sc.next();// entrada de dados - codigo alfanumerico
		char letter = s2.charAt(0);
		int digit = Integer.parseInt(s2.substring(1));
		double n2 = sc.nextDouble();

		System.out.printf("%s is %d years old and gender %s%n%n", name, age, gender);
		System.out.printf("Código: %s é composto pela letra %s e pelo digito %d%n", s2, letter, digit);
		System.out.println(n2);

		sc.close();

	}

}
