package beispiele;

import java.util.Scanner;

public class IntMultiplikation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie den ersten Faktor ein.");
        int faktor1 = input.nextInt();
        System.out.println("Bitte geben sie den zweiten Faktor ein.");
        int faktor2 = input.nextInt();
        int produkt =  faktor1 + faktor2;
        System.out.println("Die Produkt der beiden Zahlen lautet: " + produkt);
    }
}
