package _1017_Fuel_Spent;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int HOURS = scanner.nextInt();
		
		int SPEED = scanner.nextInt();
		
		Double LITERS = (SPEED / 12.0)* HOURS;
		
		System.out.printf("%.3f\n", LITERS);
	}
}
