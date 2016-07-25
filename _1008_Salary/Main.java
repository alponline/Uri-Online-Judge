package _1008_Salary;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.print("");
		int NUMBER = scanner.nextInt();
		
		System.out.print("");
		int HOUR = scanner.nextInt();
		
		System.out.print("");
		Double MONTH = scanner.nextDouble();
		
		System.out.printf("NUMBER = %d\n",NUMBER);
		System.out.printf("SALARY = U$ %.2f\n",HOUR * MONTH);
	}
}
