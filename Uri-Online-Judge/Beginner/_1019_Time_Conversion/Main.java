package _1019_Time_Conversion;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int sec = scanner.nextInt();
        int seconds = sec % 60;
        int minutes = sec / 60;
        int minute = minutes % 60;
        int hours = minutes / 60;

        System.out.printf("%d:%d:%d\n",hours,minute,seconds);
    }
}

