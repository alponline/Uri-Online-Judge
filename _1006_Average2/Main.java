package _1006_Average2;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("");
		Double A = scanner.nextDouble();
		
		System.out.print("");
		Double B = scanner.nextDouble();
		
		System.out.print("");
		Double C = scanner.nextDouble();
		
		Double MEDIA = (A *2 + B * 3 + C * 5)/10;
		
		System.out.printf("MEDIA = %.1f\n", MEDIA);
	}
}
