package beispiele;

import java.util.Scanner;

public class DoubleDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den Dividend ein.");
        double dividend = input.nextDouble();
        System.out.println("Bitte geben sie den Divisor ein.");
        double divisor = input.nextDouble();
        double  quotient =  dividend / divisor;
        System.out.println(String.format("%.2f geteilt durch %.2f ergibt %.2f",
                dividend, divisor, quotient));
    }
}
