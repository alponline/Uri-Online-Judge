package _1002_Area_Of_Circle;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
 
    public static void main(String[] args) throws IOException {
        final double n = 3.14159;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("");
			double R = Double.parseDouble(read.readLine());
			double A = n * Math.pow(R, 2);
			
			System.out.printf("A=%.4f\n", A);
			
		} catch (NumberFormatException | IOException e) {
			System.err.println("Presentation Error");
		}
    }
}
