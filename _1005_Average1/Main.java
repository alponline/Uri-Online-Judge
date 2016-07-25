package _1005_Average1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("");
			Double A = Double.parseDouble(reader.readLine());
			
			System.out.print("");
			Double B = Double.parseDouble(reader.readLine());
			
			Double MEDIA = (A * 3.5 + B * 7.5)/11;
			 System.out.printf("MEDIA = %.5f\n", MEDIA);
				
		} catch (NumberFormatException | IOException e) {
			System.err.println("Presentation Error");
		}
	}
}
