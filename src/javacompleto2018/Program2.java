package javacompleto2018;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine(); // ler o texto até a quebra de linha e armazenar em uma variável
		System.out.println(sentence);
		// ler três palavras, uma em cada linha, armazenando cada uma em uma variável
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// ler três palavras na mesma linha, separadas por espaço, armazenando em uma
		// variável
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		System.out.println("---------------------------------------------------------");

		int n1 = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();

		System.out.println(n1);
		System.out.println(s1);

		sc.close();

	}

}
