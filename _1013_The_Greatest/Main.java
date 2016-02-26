package _1013_The_Greatest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] VALUES = scanner.nextLine().split(" ");
		int A = Integer.parseInt(VALUES[0]);
		int B = Integer.parseInt(VALUES[1]);
		int C = Integer.parseInt(VALUES[2]);
		
		int MAIOR = (A + B + Math.abs(A - B))/2;
		int EHMAIOR = (MAIOR + C + Math.abs(MAIOR - C))/2;
		
		System.out.printf("%d eh o maior\n", EHMAIOR);
	}
}
