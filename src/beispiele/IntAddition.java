package beispiele;

import java.util.Scanner;

public class IntAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den ersten Summanden ein.");
        int summand1 = input.nextInt();
        System.out.println("Bitte geben sie den zweiten Summanden ein.");
        int summand2 = input.nextInt();
        int summe =  summand1 + summand2;
        System.out.println("Die Summe der beiden Zahlen lautet: " + summe);
    }
}
