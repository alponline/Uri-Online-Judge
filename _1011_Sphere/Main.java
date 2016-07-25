package _1011_Sphere;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Double PI = 3.14159;
		
		Scanner scanner = new Scanner(System.in);
		Double RADIUS = scanner.nextDouble();
		
		Double VOLUME = (4.0 / 3) * PI * Math.pow(RADIUS, 3);
		
		System.out.printf("VOLUME = %.3f\n", VOLUME);
	}
}
