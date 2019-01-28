package beispiele;

import java.util.Scanner;

public class IntModulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den Dividend ein.");
        int dividend = input.nextInt();
        System.out.println("Bitte geben sie den Divisor ein.");
        int divisor = input.nextInt();
        int rest =  dividend % divisor;
        System.out.println("Die Rest der Division lautet: " + rest);
    }
}
