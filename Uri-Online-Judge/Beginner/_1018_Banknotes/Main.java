package _1018_Banknotes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int VALUE = scanner.nextInt();
		int i = 0, x = VALUE;
		int[] VALUES = { 100,50,20,10,5,2,1 };
		int[] QTDNOTES = new int[VALUES.length];
		
		while (i < VALUES.length) {
			QTDNOTES[i] = x / VALUES[i];
			x %= VALUES[i];
			i ++;
		}
		
		System.out.printf("%d\n", VALUE);
		for (int j = 0; j < QTDNOTES.length; j++) {
			System.out.printf("%d nota(s) de R$ %d,00\n", QTDNOTES[j], VALUES[j]);
		}
	}
}
