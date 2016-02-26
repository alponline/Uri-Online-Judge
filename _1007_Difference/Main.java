package _1007_Difference;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("");
		int A = scanner.nextInt();
		
		System.out.print("");
		int B = scanner.nextInt();
		
		System.out.print("");
		int C = scanner.nextInt();
		
		System.out.print("");
		int D = scanner.nextInt();
		
		int DIFERENCA = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d\n", DIFERENCA);
	}
}
