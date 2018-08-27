package javacompleto2018;

import java.util.Scanner;

public class Program6MetodoFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers.");
		int n1 = (int) sc.nextDouble();
		int n2 = (int) sc.nextDouble();
		int n3 = (int) sc.nextDouble();
		int higher = max(n1, n2, n3);
		showResult(higher);

	}

	public static int max(int n1, int n2, int n3) {
		int maior;
		if (n1 > n2 && n1 > n3) {
			maior = n1;
		} else if (n2 > n1 && n2 > n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		return maior;
	}

	public static void showResult(int valor) {
		System.out.println("Higher: " + valor);
	}

}
