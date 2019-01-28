package beispiele;

import java.util.Scanner;

public class IntSubtraktion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den Minuenden ein.");
        int minuend = input.nextInt();
        System.out.println("Bitte geben sie den Subtrahenten ein.");
        int subtrahend = input.nextInt();
        int differenz =  minuend + subtrahend;
        System.out.println("Die Differenz der beiden Zahlen lautet: " + differenz);
    }
}
