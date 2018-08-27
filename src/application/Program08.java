package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program08 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		System.out.println("==========================");
		list.add("Mara");
		list.add("Jorge");
		list.add("Amanda");
		list.add("Claudio");
		list.add("Anna");
		list.add(0, "Benjamim");
		list.add(1, "Lucas");

		System.out.println("Lista criada com as " + list.size() + " posições abaixo.");

		for (String l1 : list) {
			System.out.println(l1);
		}

		System.out.println("==========================");
		System.out.println("Lista com posições removidas");
		list.remove("Jorge");
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String l1 : list) {
			System.out.println(l1);
		}

		System.out.println("==========================");
		System.out.println("Index of Anna ... position: " + list.indexOf("Anna"));
		System.out.println("Index of Alessandro ... position: " + list.indexOf("Alessandro"));

		System.out.println("==========================");
		System.out.println("Filtrando posições na Lista - Todos que iniciam com a letra A.");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("==========================");
		System.out.println("Encontrar o primeiro elemento que inicie com a letra A.");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

		name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst()
				.orElse("Não foi localizado valores iniciados com  letra D");
		System.out.println(name);

	}

}
