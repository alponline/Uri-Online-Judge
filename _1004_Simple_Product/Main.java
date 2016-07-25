package _1004_Simple_Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("");
			int A = Integer.parseInt(reader.readLine());
			
			System.out.print("");
			int B = Integer.parseInt(reader.readLine());
			
			int PROD = A * B;
			
			System.out.printf("PROD = %d\n",PROD);
			
		} catch (NumberFormatException | IOException e) {
			System.err.println("Presentation Error");
		}
		
	}
}

