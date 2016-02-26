package _1009_Salary_with_Bonus;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("");
		String NAME = scanner.nextLine();
		
		System.out.print("");
		Double SALARY = scanner.nextDouble();
		
		System.out.print("");
		Double MONTH = scanner.nextDouble();
		
		Double TOTAL = ((MONTH * 15)/100) + SALARY;
		
		System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
	}
}
