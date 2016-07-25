package _1010_Simple_Calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("");
			String[] items1 = reader.readLine().split(" ");
			int NUMBER1 = Integer.parseInt(items1[1]);
			Double PRICE1 = Double.parseDouble(items1[2]);
			Double TOTAL1 = NUMBER1 * PRICE1;
			
			System.out.print("");
			String[] items2 = reader.readLine().split(" ");
			int NUMBER2 = Integer.parseInt(items2[1]);
			Double PRICE2 = Double.parseDouble(items2[2]);
			Double TOTAL2 = NUMBER2 * PRICE2;
			
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL1 + TOTAL2);
			
		} catch (IOException e) {
			System.err.println("Error");
		} 
	}
}	
