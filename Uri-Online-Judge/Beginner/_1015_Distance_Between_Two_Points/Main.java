package _1015_Distance_Between_Two_Points;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] list1 = scanner.nextLine().split(" ");
		Double X1 = Double.parseDouble(list1[0]);
		Double Y1 = Double.parseDouble(list1[1]);
		
		String[] list2 = scanner.nextLine().split(" ");
		Double X2 = Double.parseDouble(list2[0]);
		Double Y2 = Double.parseDouble(list2[1]);
		
		Double VALUE = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
		
		System.out.printf("%.4f\n", VALUE);
	}
}
