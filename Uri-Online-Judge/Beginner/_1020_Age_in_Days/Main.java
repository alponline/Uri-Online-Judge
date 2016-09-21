package _1020_Age_in_Days;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int dy = scanner.nextInt();
        int days = dy % 365;//
        int mounth = dy / 365;//
        int year = mounth / 365; //

        System.out.printf("%d ano(s)\n" +
                          "%d mes(s)\n" +
                          "%d dia(s)\n",year,mounth,days);
    }
}
