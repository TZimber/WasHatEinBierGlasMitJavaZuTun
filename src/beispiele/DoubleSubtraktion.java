package beispiele;

import java.util.Scanner;

public class DoubleSubtraktion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den Minuenden ein.");
        double minuend = input.nextDouble();
        System.out.println("Bitte geben sie den Subtrahenten ein.");
        double subtrahend = input.nextDouble();
        double differenz =  minuend + subtrahend;
        System.out.println(String.format("Die Differenz der beiden Zahlen lautet: %.2f", differenz));
    }
}
