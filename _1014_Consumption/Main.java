package _1014_Consumption;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();
		Double Y = scanner.nextDouble();
		
		Double AVERAGE = X / Y;
		
		System.out.printf("%.3f km/l\n", AVERAGE);
	}
}
