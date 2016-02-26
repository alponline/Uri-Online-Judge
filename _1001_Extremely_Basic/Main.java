package _1001_Extremely_Basic;

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
			
			int X = A + B;
			
			System.out.println("X = " + X);
			
		} catch (NumberFormatException | IOException e) {
			System.err.println("Presentation Error");
		}
	}
}
