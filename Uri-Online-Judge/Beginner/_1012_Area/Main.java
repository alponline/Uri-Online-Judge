package _1012_Area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Double PI = 3.14159;
		
		Scanner scanner = new Scanner(System.in);
		
		String[] VALUES = scanner.nextLine().split(" ");

		Double A = Double.parseDouble(VALUES[0]);
		Double B = Double.parseDouble(VALUES[1]);
		Double C = Double.parseDouble(VALUES[2]);
		
		System.out.printf("TRIANGULO: %.3f\n", (A * C)/2);
		System.out.printf("CIRCULO: %.3f\n", PI * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RETANGULO: %.3f\n", A * B);
	}
}
