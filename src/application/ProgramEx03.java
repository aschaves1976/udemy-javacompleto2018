package application;

import java.util.Scanner;

import entities.Student;

public class ProgramEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();

		System.out.print("Student Name:");
		student.setName(sc.nextLine());

		System.out.println("Quarter scores:");
		student.setScore(sc.nextDouble(), 1);
		student.setScore(sc.nextDouble(), 2);
		student.setScore(sc.nextDouble(), 3);

		System.out.println(student);
		sc.close();
	}

}
