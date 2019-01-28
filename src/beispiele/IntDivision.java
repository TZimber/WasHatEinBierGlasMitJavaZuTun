package beispiele;

import java.util.Scanner;

public class IntDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den Dividend ein.");
        int dividend = input.nextInt();
        System.out.println("Bitte geben sie den Divisor ein.");
        int divisor = input.nextInt();
        int quotient =  dividend / divisor;
        System.out.println("Die Quotient der beiden Zahlen lautet: " + quotient);
    }
}
